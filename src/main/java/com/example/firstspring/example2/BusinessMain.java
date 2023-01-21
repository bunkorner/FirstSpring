package com.example.firstspring.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class BusinessMain {
    public static void main(String args[]) {
        var context = new AnnotationConfigApplicationContext(BusinessMain.class);
        System.out.println(context.getBean(BusinessCalcService.class).findMax());
//        for(String i:context.getBeanDefinitionNames())
//            System.out.println(i);
    }
}
