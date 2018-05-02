package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.annotation;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 执行的顺序，多个@PostConstruct注解的方法之间执行的顺序是随机的
 PostConstructTest: in static, staticRef is: null
 PostConstructTest: in construct, staticRef is: null reference is: null
 PostConstructTest: in @PostConstruct-2, staticRef is: null reference is: null
 PostConstructTest: in @PostConstruct, staticRef is: null reference is: null
 */

@Component
public class PostConstructTest {
    private AtomicReference<String> reference = new AtomicReference<>();
    private static final AtomicReference<String> staticRef = new AtomicReference<>();

    static {
        System.out.println("PostConstructTest: in static, staticRef is: " + JSON.toJSONString(staticRef));
    }

    public PostConstructTest() {
        System.out.println("PostConstructTest: in construct, staticRef is: " + JSON.toJSONString(staticRef) + " reference is: " + JSON.toJSONString(reference));
        if(null == reference) reference = new AtomicReference<>();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstructTest: in @PostConstruct, staticRef is: " + JSON.toJSONString(staticRef) + " reference is: " + JSON.toJSONString(reference));
    }

    public void init() {
        System.out.println("PostConstructTest: in init, staticRef is: " + JSON.toJSONString(staticRef) + " reference is: " + JSON.toJSONString(reference));
    }

    @PostConstruct
    public void postConstruct2() {
        System.out.println("PostConstructTest: in @PostConstruct-2, staticRef is: " + JSON.toJSONString(staticRef) + " reference is: " + JSON.toJSONString(reference));
    }

    public AtomicReference<String> getReference() {
        return reference;
    }

    public void setReference(AtomicReference<String> reference) {
        this.reference = reference;
    }

    public static AtomicReference<String> getStaticRef() {
        return staticRef;
    }
}
