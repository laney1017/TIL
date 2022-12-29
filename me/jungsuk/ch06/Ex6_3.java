package me.jungsuk.ch06;

class Tv3 {
    // Tv의 속성(멤버변수)
    String color;         // 색상
    boolean power;        // 전원상태(on/off)
    int channel;          // 채널

    // TV의 기능(메서드)
    void power() {
        power = !power;      // Tv를 켜거나 끄는 기능을 하는 메서드
    }
    void channelUp() {
        ++channel;         // Tv의 채널을 높이는 기능을 하는 메서드
    }
}


public class Ex6_3 {
    public static void main(String[] args) {
        Tv3 t1 = new Tv3();
        Tv3 t2 = new Tv3();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        t2 = t1;      // t1이 저장하고 있는 값(주소)을 t2에 저장한다.
        t1.channel = 7;   // channel 값을 7로 한다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }
}
/* 참조변수에는 하나의 값(주소)만이 저장될 수 있다.
   둘 이상의 참조변수가 하나의 인스턴스를 참조하는 것은 가능하지만,
   하나의 참조변수가 여러 개의 인스턴스를 참조하는 것은 가능하지 않다.
 */

// 실행결과
//t1의 channel값은 0입니다.
//t2의 channel값은 0입니다.
//t1의 channel값을 7로 변경하였습니다.
//t1의 channel값은 7입니다.
//t2의 channel값은 7입니다.