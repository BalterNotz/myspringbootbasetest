package net.btnz.pri.java.myspringbootbasetest.springbootbasetest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangsongwei on 2016/12/12.
 */
@RestController
public class Example {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Example.class, args);
//    }
}
