package com.example.firstspring;

import com.example.firstspring.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(FirstSpringApplication.class, args);

        GameRunner runner = context.getBean(GameRunner.class);

        runner.run();

    }

}
