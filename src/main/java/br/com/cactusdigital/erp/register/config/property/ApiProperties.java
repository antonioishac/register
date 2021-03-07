package br.com.cactusdigital.erp.register.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties( "app" )
public class ApiProperties {

    private String version;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }
}
