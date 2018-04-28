package net.btnz.pri.java.myspringbootbasetest.springbootbasetest.aspect.simple;

import org.springframework.stereotype.Service;

/**
 * Created by zhangsongwei on 2016/12/20.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("DemoMethodService.add()");
        addPub();
        addPro();
        addPri();
    }
    public void addPub(){
        System.out.println("Public DemoMethodService.add()");
    }
    protected void addPro(){
        System.out.println("Protected DemoMethodService.add()");
    }
    private void addPri(){
        System.out.println("Private DemoMethodService.add()");
    }
}
