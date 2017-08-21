package com.company;

public class Ball {
    int diameter;
    int gameWidth, gameHeight;
    int xPos, yPos;

    public Ball (Pong pong, int diameter) {
        gameWidth = pong.gameWidth;
        gameHeight = pong.gameHeight;

        xPos = pong.gameWidth / 2;
        yPos = pong.gameHeight / 2;

        this.diameter = diameter;
    }
}
