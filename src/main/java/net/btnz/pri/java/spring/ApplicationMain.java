package net.btnz.pri.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangsongwei on 2016/11/18.
 */
@SpringBootApplication
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
        System.out.println("Application started at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }
}
