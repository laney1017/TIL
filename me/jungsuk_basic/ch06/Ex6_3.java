package me.jungsuk_basic.ch06;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height); //클래스 변수(static변수)는 객체생성 없이 '클래스이름.클래스변수'로 직접 사용 가능하다.

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        // 안스턴스 변수의 값을 변경한다.
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number
                + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width의 height를 각각 50, 80으로 변경합니다.");
        //클래스 변수의 값을 변경한다.
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number
                + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;   //cv
    static int height = 250;  // cv
}
//실행 화면
//Card.width = 100
//Card.height = 250
//c1은 Heart, 7이며, 크기는 (100, 250)
//c2는 Spade, 4이며, 크기는 (100, 250)
//c1의 width의 height를 각각 50, 80으로 변경합니다.
//c1은 Heart, 7이며, 크기는 (50, 80)
//c2는 Spade, 4이며, 크기는 (50, 80)