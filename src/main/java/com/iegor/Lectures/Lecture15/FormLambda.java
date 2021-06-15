package com.iegor.Lectures.Lecture15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FormLambda {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        JPanel panel = new JPanel();

        JTextField text = new JTextField("           ");
        JButton button = new JButton("OK");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                text.setText("Hi");
//            }
//        });
//        button.addActionListener(e -> text.setText("Hi"));
        button.addActionListener(e -> {

//            Thread th = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int i = 0; i < 100; i++) {
//                        text.setText("Hi" + i);
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException interruptedException) {
//                            interruptedException.printStackTrace();
//                        }
//                    }
//                }
//            });
            Thread th = new Thread(
                    () -> {
                        for (int i = 0; i < 100; i++) {
                            text.setText("Hi" + i);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                        }
                    });
            th.start();
        });

//        button.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                button.setText("Click");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                button.setText("Press");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                button.setText("Release");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                button.setText("Enter");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                button.setText("Exit");
//            }
//        });
        panel.add(text);
        panel.add(button);


        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}

