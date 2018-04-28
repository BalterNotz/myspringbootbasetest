package net.btnz.pri.java.myspringbootbasetest.springbootbasetest;

import net.btnz.pri.java.myspringbootbasetest.springbootbasetest.cors.config.WebMvcConfigUtil;
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

    /**
     * 可以在application配置文件中写server.port=8080
     */
//    @Bean
//    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
//        return (ConfigurableEmbeddedServletContainer container) -> {
//            container.setPort(8080);
//        };
//    }
}
