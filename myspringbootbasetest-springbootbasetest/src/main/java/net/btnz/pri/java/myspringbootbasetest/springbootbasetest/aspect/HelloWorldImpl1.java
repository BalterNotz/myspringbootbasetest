package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.aspect;

import org.springframework.stereotype.Service;

/**
 * Created by zhangsongwei on 2016/12/30.
 */
@Service("helloWorldImpl1")
public class HelloWorldImpl1 implements HelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("HelloWorldImpl1.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("HelloWorldImpl1.doPrint()");
    }
}
