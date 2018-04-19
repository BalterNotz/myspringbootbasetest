package net.btnz.pri.java.myspringbootbasetest.aspect.simple;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zhangsongwei on 2016/12/20.
 */
@Aspect
@Component
public class SimpleLogAspect {
    @Pointcut("@annotation(net.btnz.pri.java.myspringbootbasetest.aspect.simple.Anno)")
    public void annoPointCut() {
    }

//    @After("annoPointCut()")
//    public void after(JoinPoint joinPoint){
//        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
//        Method method = methodSignature.getMethod();
//        Anno anno = method.getAnnotation(Anno.class);
//        System.out.println("注解式拦截 " + anno.name());
//    }
    @Before("execution(* net.btnz.pri.java.myspringbootbasetest.aspect.simple.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("DemoMethodService before");
    }
}
