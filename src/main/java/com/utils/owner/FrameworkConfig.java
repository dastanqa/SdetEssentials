package com.utils.owner;

import com.utils.enums.BrowserType;
import org.aeonbits.owner.Config;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Config.Sources(value = "file:${user.dir}/src/test/resources/FrameworkConfig.properties")
public interface FrameworkConfig extends Config {
    BrowserType browser();

    @DefaultValue("MINUTES")
    TimeUnit value();

    @DefaultValue("15")
    Long timeout();
    @Key("takescreenshot")
    boolean takesscreenshot();
    List<String> favtools();
}
