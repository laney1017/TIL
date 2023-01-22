package me.jungsuk.ch09;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}
public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        // toString()을 오버라이딩하지 않았기 떄문에 Object클래스의 toString()이 호출된다.
        // 클래스의 이름은 같아도 해시코드 값이 다르다.(클래스 이름과 해시코드가 출력)
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
// 실행결과
//me.jungsuk.ch09.Card@6a5fc7f7
//me.jungsuk.ch09.Card@3b6eb2ec