package me.jungsuk.ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_38 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("ActionEvent occured!!!");
                }
            } // 익명 클래스의 끝
        );
    }   // main의 끝
}

// Ex7_37을 이용해서 익명클래스로 변경
/* 먼저 두 개의 독립된 클래스를 작성한 다음에,
   다시 익명클래스를 이용하여 변경하면 보다 쉽게 코드를 작성할 수 있다.
 */
