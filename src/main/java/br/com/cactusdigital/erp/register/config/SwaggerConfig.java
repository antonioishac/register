package br.com.cactusdigital.erp.register.config;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
    	return new Docket(DocumentationType.SWAGGER_2)
    	        .select()
    	        .paths(PathSelectors.any())
    	        .apis(Predicates.or(RequestHandlerSelectors
    	            .basePackage("br.com.cactusdigital.erp.cadastros.rest"),
    	            RequestHandlerSelectors
    	                .basePackage("br.com.cactusdigital.erp.cadastros.rest")))
    	        .build().directModelSubstitute(LocalDate.class, String.class)
    	        .genericModelSubstitutes(ResponseEntity.class)
    	        .apiInfo(apiInfo())
    	        .securitySchemes(Lists.newArrayList(apiKey()))
    	        .securityContexts(Arrays.asList(securityContext()));
    }

    @Bean
    public SecurityConfiguration security() {
    return SecurityConfigurationBuilder.builder().scopeSeparator(",")
        .additionalQueryStringParams(null)
        .useBasicAuthenticationWithAccessCodeGrant(false).build();
    }

    private ApiKey apiKey() {
    	return new ApiKey("apiKey", "Authorization", "header");
    }

    private SecurityContext securityContext() {
    	return SecurityContext.builder().securityReferences(defaultAuth())
    			.forPaths(PathSelectors.any()).build();
    }

    private List<SecurityReference> defaultAuth() {
    	AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Arrays.asList(new SecurityReference("apiKey", authorizationScopes));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("API de cadastros do sistema ERP").description("")
                .termsOfServiceUrl("https://cactuserp.com.br/cadastros/swagger-ui.html")
                .contact(new Contact("Arquitetura de solu\u00e7\u00f5es", "http://www.cactuserp.com.br", "contato@cactuserp.com.br"))
                .license("Open Source").licenseUrl("https://cactuserp.com.br/cadastros/").version("1.0.0").build();
    }
}