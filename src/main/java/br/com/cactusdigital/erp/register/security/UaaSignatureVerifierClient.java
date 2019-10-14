//package br.com.cactusdigital.erp.register.security;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.jwt.crypto.sign.RsaVerifier;
//import org.springframework.security.jwt.crypto.sign.SignatureVerifier;
//import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import br.com.cactusdigital.erp.register.config.oauth2.OAuth2Properties;
//
///**
// * Client fetching the public key from UAA to create a SignatureVerifier.
// */
//@Component
//public class UaaSignatureVerifierClient implements OAuth2SignatureVerifierClient {
//    
//	@Autowired
//	@Qualifier("loadBalancedRestTemplate")
//	private RestTemplate restTemplate;
//    
//	@Autowired
//    protected OAuth2Properties oAuth2Properties;
//
//    public UaaSignatureVerifierClient(DiscoveryClient discoveryClient) {
//        // Load available UAA servers
//        discoveryClient.getServices();
//    }
//
//    /**
//     * Fetches the public key from the UAA.
//     *
//     * @return the public key used to verify JWT tokens; or null.
//     */
//    @Override
//    public SignatureVerifier getSignatureVerifier() throws Exception {
//        try {
//            HttpEntity<Void> request = new HttpEntity<Void>(new HttpHeaders());
//            String key = (String) restTemplate
//                .exchange(getPublicKeyEndpoint(), HttpMethod.GET, request, Map.class).getBody()
//                .get("value");
//            return new RsaVerifier(key);
//        } catch (IllegalStateException ex) {
//            return null;
//        }
//    }
//
//    /** Returns the configured endpoint URI to retrieve the public key. */
//    private String getPublicKeyEndpoint() {
//        String tokenEndpointUrl = oAuth2Properties.getSignatureVerification().getPublicKeyEndpointUri();
//        if (tokenEndpointUrl == null) {
//            throw new InvalidClientException("no token endpoint configured in application properties");
//        }
//        return tokenEndpointUrl;
//    }
//}