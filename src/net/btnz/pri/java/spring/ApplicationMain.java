package net.btnz.pri.java.spring;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangsongwei on 2016/11/18.
 */
public class ApplicationMain {
    public static void main(String[] argvs) {
        System.out.println("Application started at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }
}
