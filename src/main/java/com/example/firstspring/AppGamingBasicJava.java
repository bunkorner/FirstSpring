package com.example.firstspring;

import com.example.firstspring.game.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.firstspring.game")
public class AppGamingBasicJava {
    public static void main(String args[]) {
//        var game = new MarioGame();
//        var game = new ContraGame();
//        var game = new PacmanGame();
        var context = new AnnotationConfigApplicationContext(AppGamingBasicJava.class);
        var pacman = context.getBean(GameRunner.class);
        pacman.run();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }
}
