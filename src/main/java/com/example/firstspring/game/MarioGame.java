package com.example.firstspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }
    @Override
    public void down() {
        System.out.println("Duck");
    }
    @Override
    public void left() {
        System.out.println("Slow");
    }
    @Override
    public void right() {
        System.out.println("Fast");
    }
}
