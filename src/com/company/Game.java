package com.company;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by RPGenius on 8/20/2017.
 */
public class Game extends JPanel implements KeyListener, ActionListener{
    int playerCount;
    Player player1;
    Player player2;

    public Game(int numOfPlayers, Pong pong) {
        playerCount = numOfPlayers;
        startGame(pong);
    }

    public Game(Pong pong) {
        playerCount = 1;
        startGame(pong);
    }

    public void startGame(Pong pong) {
        this.setSize(pong.gameWidth, pong.gameHeight);
        this.setBackground(Color.BLACK);
        player1 = new Player(1, pong, KeyEvent.VK_W, KeyEvent.VK_S);
        player2 = new Player(2, pong, KeyEvent.VK_UP, KeyEvent.VK_DOWN);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == player1.getUpKey()) {
            player1.moveUp(1);
        } else if (e.getKeyCode() == player1.getDownKey()) {
            player1.moveDown(1);
        } else if (e.getKeyCode() == player2.getUpKey()) {
            player2.moveUp(1);
        } else if (e.getKeyCode() == player2.getDownKey()) {
            player2.moveDown(1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        paintPaddle(player1, g);
        paintPaddle(player2, g);


    }

    public void paintPaddle(Player player, Graphics g) {
        g.fillRect(player.getxPos(), player.getyPos(), player.getPaddleWidth(), player.getPaddleHeight());
    }

    public void update() {

    }
}
