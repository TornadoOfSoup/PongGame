package com.company;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame{

    static Panel gamePanel;

    public Game () {
        setTitle("Pong");
        setSize(500, 700);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public static void main(String[] args) {
        titleScreen();
    }


    public static void titleScreen() {
        gamePanel.setBackground(Color.BLACK);

        JLabel titleLabel = new JLabel("PONG");
        titleLabel.setForeground(Color.GRAY);
        titleLabel.setFont(new Font("Papyrus", Font.BOLD, 100));

        titleLabel.setVerticalAlignment(JLabel.TOP);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setLocation(0,0);


        JButton playGameButton = new JButton("Play Game");

        playGameButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        playGameButton.setBackground(Color.DARK_GRAY);
        playGameButton.setBorder(BorderFactory.createLineBorder(new Color(90, 90, 90), 2));
        playGameButton.setForeground(new Color(200, 200, 200));

        playGameButton.setFocusPainted(false);

        playGameButton.setHorizontalAlignment(JButton.CENTER);
        playGameButton.setVerticalAlignment(JButton.BOTTOM);

        gamePanel.add(titleLabel, BorderLayout.PAGE_START);
        gamePanel.add(playGameButton, BorderLayout.PAGE_END);

        gamePanel.setVisible(true);

        gamePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + ", " + e.getY());
            }
        });

        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                gameScreen();
            }
        });
    }

    public static void gameScreen() {
        JFrame gameFrame = new JFrame("Pong");
        Paddle paddle1 = new Paddle(1);

        Rectangle player1 = new Rectangle(100, 20);
    }
}
