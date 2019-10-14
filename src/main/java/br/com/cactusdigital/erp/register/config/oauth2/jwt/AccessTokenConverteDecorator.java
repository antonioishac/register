//package br.com.cactusdigital.erp.register.config.oauth2.jwt;
//
//import java.util.Map;
//
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.UserAuthenticationConverter;
//
//public class AccessTokenConverteDecorator extends DefaultAccessTokenConverter {
//
//	/**
//	 * UserAuthenticationConverterDecorator
//	 */
//	private final UserAuthenticationConverter userTokenConverter = new UserAuthenticationConverterDecorator();
//
//	/**
//	 * contructor no args
//	 */
//	public AccessTokenConverteDecorator() {
//		super();
//		super.setUserTokenConverter(userTokenConverter);
//	}
//
//	@Override
//	public OAuth2AccessToken extractAccessToken(String value, Map<String, ?> map) {
//		return super.extractAccessToken(value, map);
//	}
//
//	@Override
//	public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
//		return super.extractAuthentication(map);
//	}
//
//}