package net.btnz.pri.java.spring;

import net.btnz.pri.java.spring.cors.config.WebMvcConfigUtil;
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
}
