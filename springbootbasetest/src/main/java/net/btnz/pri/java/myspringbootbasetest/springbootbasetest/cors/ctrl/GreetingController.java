package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.cors.ctrl;

import net.btnz.pri.java.myspringbootbasetest.springbootbasetest.cors.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zhangsongwei on 2016/11/22.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/greeting")
//    @RequestMapping("greeting")
    public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        System.out.println("=== in greeting ===");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greeting-javaconfig")
    public Greeting greetingWithJavaConfig(@RequestParam(required = false, defaultValue = "World") String name) {
        System.out.println("=== in greeting ===");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
