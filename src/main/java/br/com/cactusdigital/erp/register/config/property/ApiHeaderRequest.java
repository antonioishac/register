package br.com.cactusdigital.erp.register.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collection;
import java.util.Map;

@ConfigurationProperties( "header-request" )
@Data
public class ApiHeaderRequest {

	private Map<String,Map<String, Collection<String>>> headers;
	
	public Map<String, Collection<String>> config( String key ){
		return headers.get(key);
	}
}
