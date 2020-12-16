package br.com.cactusdigital.erp.register.config;

public class Constants {

	public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymoususer";
    public static final String DEFAULT_LANGUAGE = "pt-br";
    public static final String PROFILE_DEV = "dev";
    public static final String PROFILE_HML = "hml";
    public static final String PROFILE_PROD = "prod";
    public static final String PROFILE_CLOUD = "cloud";

    private Constants() {
        throw new IllegalStateException("Utility class");
    }
    
}