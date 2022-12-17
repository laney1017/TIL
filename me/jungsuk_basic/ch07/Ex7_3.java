package me.jungsuk_basic.ch07;

public class Ex7_3 {
    public static void main(String args[]) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10; // suepr.x와 this.x 둘 다 가능
}
class Child2 extends Parent2 {
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + x);
        System.out.println("super.x=" + x);
    }
}
//실행결과
//x=10
//this.x=10
//super.x=10
//x, this.x, super.x 모두 같은 변수 의미
//모든 인스턴스 메서드에는 this와 super가 지역변수로 존재한다. 조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점만 제외하면 this와 super는 근본적으로 같다.