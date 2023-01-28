package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:browserstack.properties")

public interface BrowserstackConfig extends Config {

    String username();
    String password();

    @DefaultValue("bs://01e17240ba7a175af125b6c9c60f8ed39f1544fa")
    String bs();

    @DefaultValue("Google Pixel 3")
    String device();

    @DefaultValue("9.0")
    String osVersion();

}