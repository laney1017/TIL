package me.jungsuk.ch07;

import java.awt.*;
import java.awt.event.*;

public class Ex7_37 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("ActionEvent occurred!!!");
    }
}

// AWT(Java의 윈도우 프로그래밍)