package br.com.cactusdigital.erp.register.exception.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collection;
import java.util.Map;

@ConfigurationProperties( "header-request" )
@Data
public class ApiHearderRequest {

	private Map<String,Map<String, Collection<String>>> headers;
	
	public Map<String, Collection<String>> config( String key ){
		return headers.get(key);
	}
}
