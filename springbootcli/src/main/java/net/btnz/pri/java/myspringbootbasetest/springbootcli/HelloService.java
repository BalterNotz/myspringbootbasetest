package net.btnz.pri.java.myspringbootbasetest.springbootcli;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String say(String msg) {
        System.out.println("HelloService say: " + msg);
        return "Echo: " + msg;
    }
}
