package me.jungsuk.ch07;

class Card1 {
    final int NUMBER;       // 상수지만 선언과 함께 초기화 하지 않고
    final String KIND;     // 생성자에서 단 한번만 초기화할 수 있다.
    static int width = 100;
    static int height = 250;

    Card1(String kind, int num) {
//      매개변수로 넘겨받은 값으로 KIND와 NUMBER을 초기화한다.
        KIND = kind;
        NUMBER = num;
    }

    Card1() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class Ex7_12 {
    public static void main(String[] args) {
        Card1 c = new Card1("HEART", 10);
//        c.NUMBER = 5;         에러 : cannot assign a value to final variable NUMBER
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);      // System.out.println(c.toString());
    }
}
/* 클래스 내에 ㅔ매개변수를 갖는 생성자를 선언하여, 인스턴스를 생성할 때 final이 붙은 멤버변수를 초기화하는데 필요한 값을
   생성자의 매개변수로부터 제공받는 방법
   -> 각 인스턴스마다 final이 붙은 멤버변수가 다른 값을 갖도록 하는 것이 가능.
 */

// 실행결과
//HEART
//10
//HEART 10