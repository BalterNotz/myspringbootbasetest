package net.btnz.pri.java.myspringbootbasetest;

import net.btnz.pri.java.myspringbootbasetest.cors.config.WebMvcConfigUtil;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by zhangsongwei on 2016/11/22.
 */
@Configuration
public class BaseConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return WebMvcConfigUtil.buildWebMvcConfigurer();
    }

    @Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return (ConfigurableEmbeddedServletContainer container) -> {
            container.setPort(8080);
        };
    }
}
