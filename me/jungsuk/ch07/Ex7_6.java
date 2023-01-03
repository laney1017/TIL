package me.jungsuk.ch07;


public class Ex7_6 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);     // 자손 클래스에 정의된 멤버변수
        System.out.println("super.x=" + super.x);   // 조상 클래스로부터 상속받은 멤버변수
    }
}
/* 조상 클래스에 선언된 멤버변수와 같은 이름의 멤버변수를 자손 클래스에서 중복해서 정의하는 것은 가능하다.
   이때, 참조변수 super를 이용해서 서로 구별할 수 있다.
 */

// 실행결과
//x=20
//this.x=20
//super.x=10