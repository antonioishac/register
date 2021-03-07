package br.com.cactusdigital.erp.register;

import br.com.cactusdigital.erp.register.config.property.ApiHeaderRequest;
import br.com.cactusdigital.erp.register.config.property.ApiProperties;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

@EnableConfigurationProperties( value = { ApiProperties.class, ApiHeaderRequest.class } )
@SpringBootApplication
@EnableFeignClients
public class SpringApp {

    private static final String LINE_SEPARATE = StringUtils.repeat("-", 127);
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringApp.class);

    public static void main(String[] args) throws UnknownHostException {

        final SpringApplication app = new SpringApplication(SpringApp.class);
        final Environment env = app.run(args).getEnvironment();
        String protocol = "http";

        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }

        LOGGER.info(LINE_SEPARATE);
        LOGGER.info( String.format("Application:    %s", env.getProperty("spring.application.name") ) );
        LOGGER.info( String.format("Version:         %s", env.getProperty("app.version") ) );
        LOGGER.info( String.format("Local:          %s://localhost:%s" , protocol , env.getProperty("server.port") ) );
        LOGGER.info( String.format("External:       %s://%s:%s" , protocol , InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port") ) );
        LOGGER.info( String.format("Database:       %s / %s" , env.getProperty("spring.datasource.url") , env.getProperty("spring.datasource.username") ) );
        LOGGER.info( String.format("Profiles:       %s", Arrays.asList(env.getActiveProfiles() ) ) );
        LOGGER.info(LINE_SEPARATE);

    }

//    public static void main(String[] args) {
//        SpringApplication.run(SpringApp.class, args);
//    }
}