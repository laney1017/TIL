package me.jungsuk.ch06;

public class Ex6_5 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);       // cv는 객체생성없이 클래스이름.클래스변수로 사용가능
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;            // 클래스변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
        c1.height = 80;           // 클래스변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}

class Card {
    String kind;            // 개별속성 iv
    int number;             // 개별속성 iv
    static int width = 100;     // 공통속성 cv
    static int height = 250;    // 공통속성 cv
}

// 실행결과
//Card.width = 100
//Card.height = 250
//c1은 Heart, 7이며, 크기는 (100, 250)
//c2은 Spade, 4이며, 크기는 (100, 250)
//c1의 width와 height를 각각 50, 80으로 변경합니다.
//c1은 Heart, 7이며, 크기는 (50, 80)
//c2은 Spade, 4이며, 크기는 (50, 80)