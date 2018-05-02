package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class PostConstructTestHelper {
    @Resource
    private PostConstructTest postConstructTest;

    @PostConstruct
    public void runPostConstruct() {
        System.out.println("in PostConstructHelper " + postConstructTest.getReference());
        System.out.println("in PostConstructHelper " + PostConstructTest.getStaticRef());
    }
}
