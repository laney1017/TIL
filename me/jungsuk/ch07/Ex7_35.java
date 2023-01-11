package me.jungsuk.ch07;

class Outer1 {
    int value = 10; // Outer.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("            value :" + value);
            System.out.println("       this.value :" + this.value);
            System.out.println("Outer1.this.value :" + Outer1.this.value);
        }
    }   // Inner클래스의 끝
}   // Outer1클래스의 끝

public class Ex7_35 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner inner = outer1.new Inner();
        inner.method1();
    }
}
/* 내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때,
   변수 앞에 this 또는 외부클래스명.this를 붙여서 서로 구별할 수 있다.
 */

// 실행결과
//            value :30
//       this.value :20
//Outer1.this.value :10