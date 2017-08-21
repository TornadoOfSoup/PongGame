package com.company;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Pong extends JFrame{

    int gameWidth = 800, gameHeight = 500;

    public Pong() {
        setTitle("Pong");
        setSize(gameWidth, gameHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        titleScreen(this);
    }

    public static void main(String[] args) {
        Pong pong = new Pong();
    }


    public static void titleScreen(Pong pong) {
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

        pong.add(titleLabel, BorderLayout.PAGE_START);
        pong.add(playGameButton, BorderLayout.PAGE_END);

        pong.setVisible(true);

        pong.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + ", " + e.getY());
            }
        });

        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                pong.setVisible(false);
                Game game = new Game(2, pong);
            }
        });
    }

}
