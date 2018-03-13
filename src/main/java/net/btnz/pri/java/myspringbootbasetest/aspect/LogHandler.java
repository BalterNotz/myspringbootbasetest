package net.btnz.pri.java.myspringbootbasetest.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by zhangsongwei on 2016/12/30.
 */
@Component
public class LogHandler {
    public void logBefore() {
        System.out.println("Log before method");
    }

    public void logAfter() {
        System.out.println("Log after method");
    }
}
