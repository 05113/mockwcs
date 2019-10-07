package com.quicktron.wcsmock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.quicktron.wcsmock")
@EnableAutoConfiguration
public class WcsmockApplication {

    public static void main(String[] args) {
        SpringApplication.run(WcsmockApplication.class, args);
    }

}
