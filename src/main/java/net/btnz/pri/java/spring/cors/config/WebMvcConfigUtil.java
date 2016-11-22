package net.btnz.pri.java.spring.cors.config;

import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * Created by zhangsongwei on 2016/11/22.
 */
public class WebMvcConfigUtil {
    public static WebMvcConfigurer buildWebMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {

            }

            @Override
            public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

            }

            @Override
            public void configureAsyncSupport(AsyncSupportConfigurer configurer) {

            }

            @Override
            public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

            }

            @Override
            public void addFormatters(FormatterRegistry registry) {

            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {

            }

            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {

            }

            @Override
            public void addCorsMappings(CorsRegistry corsRegistry) {
                corsRegistry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:9000");
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {

            }

            @Override
            public void configureViewResolvers(ViewResolverRegistry registry) {

            }

            @Override
            public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

            }

            @Override
            public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {

            }

            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

            }

            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

            }

            @Override
            public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {

            }

            @Override
            public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {

            }

            @Override
            public Validator getValidator() {
                return null;
            }

            @Override
            public MessageCodesResolver getMessageCodesResolver() {
                return null;
            }
        };
    }
}
