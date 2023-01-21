package com.example.firstspring.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan
public class AppGamingDependencyJava {
    public static void main(String args[]) {
      var context = new AnnotationConfigApplicationContext(AppGamingDependencyJava.class);
      for(String i:context.getBeanDefinitionNames())
        System.out.println(i);
    }
}
