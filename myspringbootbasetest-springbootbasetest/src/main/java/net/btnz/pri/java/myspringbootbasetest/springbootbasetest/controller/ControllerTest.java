package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.controller;

import com.alibaba.fastjson.JSON;
import net.btnz.pri.java.myspringbootbasetest.springbootbasetest.annotation.PostConstructTest;
import net.btnz.pri.java.myspringbootbasetest.springbootbasetest.pojo.Pojo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ControllerTest {

    @Resource
    private PostConstructTest postConstructTest;

    @GetMapping("/sayhello")
    public String sayHello() {
        System.out.println("PostConstructTest: reference = " + postConstructTest.getReference());
        System.out.println("PostConstructTest: staticRef = " + PostConstructTest.getStaticRef());
        System.out.println("Hello World!");
        if(postConstructTest.getReference() == null){
            postConstructTest.setReference(new AtomicReference<>());
        }
        System.out.println("in sayhello after new PostConstructTest: reference = " + postConstructTest.getReference());


        PostConstructTest newPostConstructTest = new PostConstructTest();
        System.out.println("new PostConstructTest: reference = " + newPostConstructTest.getReference());
        System.out.println("new PostConstructTest: staticRef = " + PostConstructTest.getStaticRef());


        Pojo pojo = new Pojo();
        System.out.println("POJO: " + pojo.strRef);
        System.out.println("POJO: " + pojo.setRef);
        return JSON.toJSONString(postConstructTest);
    }
}
