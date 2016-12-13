package net.btnz.pri.java.spring.web;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhangsongwei on 2016/12/12.
 */
@RequestMapping("/cmd")
@RestController
public class CommandLineCtrl implements CommandLineRunner {
    private static Logger log = LoggerFactory.getLogger(CommandLineCtrl.class);

    private static String[] args = null;

    @Resource
    private ConfigurableEnvironment configurableEnvironment;

    @Autowired
    private ConnectConfig connectConfig;

    @Resource
    private FooCompoent fooCompoent;

    @Value("${name}")
    private String name;

    @Value("${appdesc}")
    private String appdesc;

    @Value("${random.value}")
    private String randomValue;

    @Value("${random.int}")
    private String randomInt;

    @Value("${random.long}")
    private String randomLong;

    @Value("${random.int(10)}")
    private String randomLessThanInt;

    @Value("${random.int[1024,65536]}")
    private String randomBigLessInt;

    @RequestMapping(value = "/args", method = RequestMethod.GET)
    public String[] args() {
        return args;
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String name() {
        return name;
    }

    @RequestMapping(value = "/appdesc", method = RequestMethod.GET)
    public String appDesc(){
        return appdesc;
    }

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public String[] random(){
        return new String[]{randomValue, randomInt, randomLong, randomLessThanInt, randomBigLessInt};
    }

    @RequestMapping(value = "/connect", method = RequestMethod.GET)
    public String[] connectConfig() {
        return new String[]{connectConfig.getName(), connectConfig.getPasswd(), connectConfig.getUrl()};
    }

    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    public FooCompoent fooCompoent(){
        return fooCompoent;
    }

    @RequestMapping(value = "/env", method = RequestMethod.GET)
    public String env(){
        return JSON.toJSONString(configurableEnvironment);
    }

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String log(){
        for(int i = 0; i < 100; i++) {
            log.trace("...trace...");
            log.debug("...debug...");
            log.info("...info...");
            log.warn("...warn...");
            log.error("...error...");

            log.info("Hello, {}", "log");
            log.info("Fruit: {}", new String[]{"Orange", "Apple", "Banana"});
        }
        return "log";
    }

    @Override
    public void run(String... strings) throws Exception {
        if (null != args) {
            return;
        }
        System.out.println("<<<   assign args   >>>");
        args = strings;
    }
}
