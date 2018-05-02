package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zhangsongwei on 2016/12/30.
 */
@Aspect
@Component
@Order(2)
public class LogAspect {
    @Resource
    private LogHandler logHandler;

    @Pointcut("execution(* net.btnz.pri.java.myspringbootbasetest.springbootbasetest.aspect.HelloWorld.*(..))")
    public void printLog(){

    }

    @Before("printLog()")
    public void logBefore(){
        logHandler.logBefore();
    }
    @After("printLog()")
    public void logAfter(){
        logHandler.logAfter();
    }
}
