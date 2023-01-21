package com.example.firstspring.example.a1;

import com.example.firstspring.game.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass{
    @Autowired
    Dependency1 dependency1;

    @Override
    public String toString() {
        return "BusinessClass{" +
                "dependency1=" + dependency1 +
                '}';
    }
}
@Component
class Dependency1 {
    @Autowired
    Dependency2 dependency2;

    @Override
    public String toString() {
        return "Dependency1{" +
                "dependency2=" + dependency2 +
                '}';
    }
}
@Component
class Dependency2 {

}
@Configuration
@ComponentScan
public class AppGamingDependencyJava {
    public static void main(String args[]) {
      var context = new AnnotationConfigApplicationContext(AppGamingDependencyJava.class);
        System.out.println(context.getBean(BusinessClass.class));
    }
}
