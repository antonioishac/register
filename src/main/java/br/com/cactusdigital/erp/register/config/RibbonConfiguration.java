//package br.com.cactusdigital.erp.register.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.web.client.RestTemplateCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.client.OAuth2ClientContext;
//import org.springframework.security.oauth2.client.OAuth2RestOperations;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
//import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
//import org.springframework.web.client.RestTemplate;
//
//@Configuration
//public class RibbonConfiguration {
//	
//	@Autowired
//    private OAuth2ProtectedResourceDetails resource;
//
//	@Bean
//	@Qualifier("loadBalancedRestTemplate")
//    public RestTemplate loadBalancedRestTemplate(RestTemplateCustomizer customizer) {
//        RestTemplate restTemplate = new RestTemplate();
//        customizer.customize(restTemplate);
//        return restTemplate;
//    }
//
//    @Bean
//    @Qualifier("vanillaRestTemplate")
//    public RestTemplate vanillaRestTemplate() {
//        return new RestTemplate();
//    }
//
//    @Bean
//    public OAuth2RestOperations restTemplate (OAuth2ClientContext context, RestTemplateCustomizer customizer) {
//        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resource, context);
//        customizer.customize(restTemplate);
//        return restTemplate;
//    }
//
//}