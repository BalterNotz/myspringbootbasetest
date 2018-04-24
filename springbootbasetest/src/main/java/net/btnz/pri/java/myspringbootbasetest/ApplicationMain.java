package net.btnz.pri.java.myspringbootbasetest;

import com.alibaba.fastjson.JSON;
import net.btnz.pri.java.myspringbootbasetest.annotation.PostConstructTest;
import net.btnz.pri.java.myspringbootbasetest.annotation.PostConstructTestHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangsongwei on 2016/11/18.
 */
@SpringBootApplication
public class ApplicationMain {

    @Resource
    private PostConstructTestHelper postConstructTestHelper;

    @Resource
    private PostConstructTest postConstructTest;

    public static void main(String[] args) {

        //        SpringApplication.run(ApplicationMain.class, args);
//        new SpringApplicationBuilder().sources(ApplicationMain.class).run(args);
//        SpringApplication application = new SpringApplication(ApplicationMain.class);
//        Banner banner = new Banner() {
//            @Override
//            public void printBanner(Environment environment, Class<?> aClass, PrintStream printStream) {
//
//            }
//        };
//        application.setBanner(banner);
//        application.run(args);
        Map properties = new HashMap();
//        properties.put("name", "defaultProperties_name");
        properties.put("spring.config.name", "myprojectconf");
        System.out.println(JSON.toJSONString(args));
        SpringApplication application = new SpringApplication(ApplicationMain.class);
        application.setWebEnvironment(true);
        application.setDefaultProperties(properties);
        application.setAddCommandLineProperties(true);
        application.setAdditionalProfiles("dev");
        application.run(args);

        System.out.println("Application started at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date()));
    }
}
