package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtControllerTest extends ControllerTest {
    public String sayHello() {
        return "hello from ext controller test";
    }
}
