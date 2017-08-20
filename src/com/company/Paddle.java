package com.company;

public class Paddle {
    int xPos, yPos;

    public Paddle(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("Paddle has been created and initialized at coordinates (" + this.xPos + ", " + this.yPos + ")");
    }

    public Paddle(int playerNumber) {
        if (playerNumber == 1) {
            this.xPos = 250;
            this.yPos = 650;
        } else if (playerNumber == 2) {
            this.xPos = 250;
            this.xPos = 50;
        }

        System.out.println("Paddle " + playerNumber + " has been created and initialized at coordinates (" + this.xPos + ", " + this.yPos + ")");
    }

    public void moveLeft(int distance) {
        if (this.xPos <= 590) {
            this.xPos = this.xPos + 10;
        } else {
            this.xPos = 600;
        }
    }

    public void moveRight(int distance) {
        if (this.xPos >= 10) {
            this.xPos = this.xPos - 10;
        } else {
            this.xPos = 0;
        }
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
