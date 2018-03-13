package net.btnz.pri.java.myspringbootbasetest.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by zhangsongwei on 2016/12/12.
 */
@Configuration
@EnableConfigurationProperties(ConnectConfig.class)
public class Config {
    @Bean
    @ConfigurationProperties(prefix = "foo")
    public FooCompoent fooCompoent(){
        return new FooCompoent();

    }
}
