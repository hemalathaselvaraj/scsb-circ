package org.recap.camel.requestinitialdataload;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;
import org.recap.ReCAPConstants;
import org.recap.camel.requestinitialdataload.processor.RequestInitialDataLoadProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by hemalathas on 3/5/17.
 */
@Component
public class RequestInitialDataLoadPollingFtpRouteBuilder {

    private static final Logger logger = LoggerFactory.getLogger(RequestInitialDataLoadPollingFtpRouteBuilder.class);

    public RequestInitialDataLoadPollingFtpRouteBuilder(CamelContext camelContext, ApplicationContext applicationContext,
                                                        @Value("${ftp.userName}") String ftpUserName, @Value("${request.initial.accession}") String requestAccessionFolder,
                                                        @Value("${ftp.knownHost}") String ftpKnownHost, @Value("${ftp.privateKey}") String ftpPrivateKey,
                                                        @Value("${request.initial.accession.work.directory}") String requestWorkDirectory,
                                                        @Value("${request.initial.accession.error.file}") String requestInvalidFile){

        try{
            camelContext.addRoutes(new RouteBuilder(){
                @Override
                public void configure() throws Exception {
                    from(ReCAPConstants.SFTP + ftpUserName + ReCAPConstants.AT + requestAccessionFolder + ReCAPConstants.PRIVATE_KEY_FILE + ftpPrivateKey + ReCAPConstants.KNOWN_HOST_FILE + ftpKnownHost+ReCAPConstants.SUBMIT_COLLECTION_SFTP_OPTIONS+requestWorkDirectory).
                            unmarshal().bindy(BindyType.Csv, RequestDataLoadCSVRecord.class)
                            .bean(RequestInitialDataLoadProcessor.class, ReCAPConstants.PROCESS_INPUT)
                            .marshal().bindy(BindyType.Csv, RequestDataLoadErrorCSVRecord.class)
                            .to("sftp://" + ftpUserName + "@" + requestInvalidFile + "?privateKeyFile=" + ftpPrivateKey + "&knownHostsFile=" + ftpKnownHost + "&fileName=RequestInvalidItem-${date:now:ddMMMyyyy}.csv");
                }
            });
        }catch (Exception e){
            logger.error(ReCAPConstants.LOG_ERROR,e);
        }

    }
}
