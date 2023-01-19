package com.example.firstspring;

import com.example.firstspring.game.GameRunner;
import com.example.firstspring.game.GamingConsole;
import com.example.firstspring.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
    @Bean(name = "pac")
    public GamingConsole pacmanGame() {
        return new PacmanGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole pacmanGame) {
        return new GameRunner(pacmanGame);
    }
}
