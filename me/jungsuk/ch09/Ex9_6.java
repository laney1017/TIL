package me.jungsuk.ch09;

class Card1{
    String kind;
    int number;

    Card1() {
        this("SPADE", 1);   // Card(String kind, int number)를 호출
    }

    Card1(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // Object클래스에 정의된 toString의 접근제어자가 public이므로 자손에서 오버라이딩 할 때도 접근제어자를 puyblic으로 했다
    // 조상에 정의된 메서드를 자손에서 오버라이딩할 때는 조상에 정의된 접근 범위보다 같거나 더 넓어야 한다.
    public String toString() {
        return "kind : " + kind + ", number : " + number; // Card인스턴스의 kind와 number를 문자열로 반환하도록 오버라이딩
    }
}
public class Ex9_6 {
    public static void main(String[] args) {
        Card1 c1 = new Card1();
        Card1 c2 = new Card1("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
// 실행결과
//kind : SPADE, number : 1
//kind : HEART, number : 10