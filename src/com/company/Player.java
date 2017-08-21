package com.company;

import java.awt.*;

public class Player {
    int xPos, yPos;
    int gameWidth, gameHeight;
    int paddleWidth, paddleHeight;
    int upKey, downKey;
    int playerNumber;

    public Player(int playerNumber, Pong pong, int up, int down) {
        gameHeight = pong.gameHeight;
        gameWidth = pong.gameWidth;

        this.playerNumber = playerNumber;

        upKey = up;
        downKey = down;

        paddleHeight = 100;
        paddleWidth = 20;
        if (playerNumber == 1) {
            this.xPos = 50;
            this.yPos = Math.round(gameHeight / 2);
        } else if (playerNumber == 2) {
            this.xPos = gameWidth - 50;
            this.xPos = Math.round(gameHeight / 2);
        }

        System.out.println("Paddle " + playerNumber + " has been created and initialized at coordinates (" + this.xPos + ", " + this.yPos + ")");
    }

    public void moveUp(int distance) {
        if (this.yPos <= this.gameHeight - 10) {
            this.yPos = this.yPos + 10;
        } else {
            this.yPos = gameHeight;
        }

        System.out.println("Player " + this.getPlayerNumber() + " has moved up");
    }

    public void moveDown(int distance) {
        if (this.yPos >= gameHeight + 10) {
            this.yPos = this.yPos - 10;
        } else {
            this.yPos = 0;
        }

        System.out.println("Player " + this.getPlayerNumber() + " has moved down");
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getDownKey() {
        return downKey;
    }

    public int getUpKey() {
        return upKey;
    }

    public int getPaddleHeight() {
        return paddleHeight;
    }

    public int getPaddleWidth() {
        return paddleWidth;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public Rectangle getBounds() {
        return new Rectangle(xPos, yPos, paddleWidth, paddleHeight);
    }

    public void update() {

    }
}
