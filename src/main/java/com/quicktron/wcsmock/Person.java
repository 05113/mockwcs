package com.quicktron.wcsmock;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class Person {
    public void Drive(String name){
        System.out.println(name +".....driving");
    }
}
