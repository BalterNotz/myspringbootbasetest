package net.btnz.pri.java.myspringbootbasetest.aspect.simple;

import org.springframework.stereotype.Service;

/**
 * Created by zhangsongwei on 2016/12/20.
 */
@Service
public class DemoAnnotationService {
    @Anno(name = "DemoAnnotationService.add")
    public void add() {
        System.out.println("DemoAnnotationService.add()");
    }
}
