package net.btnz.pri.java.spring.web;

import net.btnz.pri.java.spring.aspect.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhangsongwei on 2016/12/30.
 */
@RequestMapping("/aspect")
@RestController
public class Aspect {
    @Resource
    private HelloWorld[] helloWorld;

    @Resource
    private HelloWorld helloWorldImpl1;

    @Resource
    private HelloWorld helloWorldImpl2;

    @RequestMapping(value = "/helloworld1", method = RequestMethod.GET)
    public String helloWorld1(){
        helloWorldImpl1.printHelloWorld();
        helloWorldImpl1.doPrint();
        return "helloworld1";
    }

    @RequestMapping(value = "/helloworld2", method = RequestMethod.GET)
    public String helloWorld2(){
        helloWorldImpl2.printHelloWorld();
        helloWorldImpl2.doPrint();
        return "helloWorld2";
    }
}
