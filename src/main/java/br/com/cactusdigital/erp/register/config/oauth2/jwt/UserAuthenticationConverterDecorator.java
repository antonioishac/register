//package br.com.cactusdigital.erp.register.config.oauth2.jwt;
//
//import java.util.Map;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.provider.token.DefaultUserAuthenticationConverter;
//
//import br.com.cactusdigital.erp.register.domain.auth.Usuario;
//
//public class UserAuthenticationConverterDecorator extends DefaultUserAuthenticationConverter {
//	/**
//	 * key add in {@link CustomTokenEnhacer}
//	 */
//	private static final String KEY_ID_USER = "id";
//
//	@Override
//	public Authentication extractAuthentication(Map<String, ?> map) {
//		UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) super.extractAuthentication( map);
//		if (map.containsKey(KEY_ID_USER)) {
//			Usuario user = extractUser(map);
//			return new UsernamePasswordAuthenticationToken(user, "N/A", auth.getAuthorities());
//		}
//		return auth;
//	}
//
//	/**
//	 * recupera o User
//	 *
//	 * @param map
//	 * @param auth
//	 * @return {@link Usuario}
//	 */
//	private Usuario extractUser(Map<String, ?> map) {
//		Usuario usuario = new Usuario();
//		usuario.setId(((Number) map.get(KEY_ID_USER)).longValue());
//		return usuario;
//	}
//
//}