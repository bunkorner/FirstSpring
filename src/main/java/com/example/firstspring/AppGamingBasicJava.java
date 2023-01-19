package com.example.firstspring;

import com.example.firstspring.game.ContraGame;
import com.example.firstspring.game.GameRunner;
import com.example.firstspring.game.MarioGame;
import com.example.firstspring.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {
    public static void main(String args[]) {
//        var game = new MarioGame();
//        var game = new ContraGame();
//        var game = new PacmanGame();
        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        var pacman = context.getBean(GameRunner.class);
        pacman.run();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }
}
