package net.btnz.pri.java.spring.aspect;

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
@Order(1)
public class TimeAspect {
    @Resource
    private TimeHandler timeHandler;

    /**
     * 切入点，在哪里切入，施加影响
     */
    @Pointcut("execution(* net.btnz.pri.java.spring.aspect.HelloWorld.*(..))")
    public void addAllMethod(){

    }

    @Before("addAllMethod()")
    @Order(1)
    public void beforePrint2() {
        timeHandler.printTime();
        System.out.println("beforePrint2");
    }

    /**
     * advice，增强点，增强什么，这里，在切入点执行之前打印时间
     */
    @Before("addAllMethod()")
    @Order(2)
    public void beforePrint() {
        timeHandler.printTime();
    }

    @After("addAllMethod()")
    public void afterPrint(){
        timeHandler.printTime();
    }
}
