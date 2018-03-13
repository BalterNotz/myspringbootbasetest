package net.btnz.pri.java.myspringbootbasetest.aspect;

import org.springframework.stereotype.Service;

/**
 * Created by zhangsongwei on 2016/12/30.
 */
@Service("helloWorldImpl2")
public class HelloWorldImpl2 implements HelloWorld {
    public void printHelloWorld() {
        System.out.println("HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint() {
        System.out.println("HelloWorldImpl2.doPrint()");
    }
}
