package net.btnz.pri.java.myspringbootbasetest.quasar;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String... args) throws InterruptedException {
        SpringApplication.run(MainApplication.class, args);

        System.out.println("---------- Hello World! ------------");

        Fiber<String> fiber = new Fiber<String>() {
            @Override
            protected String run() throws SuspendExecution, InterruptedException {
                System.out.println("In Fiber Hello World!");
                return "abc";
            }
        };

        fiber.start();
        Thread.sleep(999999999999999l);
    }
}
