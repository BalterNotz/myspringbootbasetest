package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtControllerTest extends ControllerTest {
    @GetMapping("/sayhello")
    public String sayHello() {
        return "hello from ext controller test";
    }
}
