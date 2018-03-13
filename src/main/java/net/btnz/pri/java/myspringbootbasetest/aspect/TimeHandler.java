package net.btnz.pri.java.myspringbootbasetest.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by zhangsongwei on 2016/12/30.
 */

/**
 * 关注点，关注的是什么，这里，关注的是时间
 */
@Component
public class TimeHandler {
    public void printTime(){
        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }
}
