package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:auth.properties"
})

public interface AuthConfig extends Config{

    @Key("username")
    @DefaultValue("kseniiabogatko_gbDJ2A")
    String username();

    @Key("password")
    @DefaultValue("VdRu6UvRq8ojJYKpyy5b")
    String password();

    @Key("bs")
    @DefaultValue("bs://01e17240ba7a175af125b6c9c60f8ed39f1544fa")
    String bs();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();
}