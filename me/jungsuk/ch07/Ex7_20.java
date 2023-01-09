package me.jungsuk.ch07;

public class Ex7_20 {
    public static void main(String[] args) {
        Parent5 p = new Child5();
        Child5 c = new Child5();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent5 {
    int x = 100;

    void method() {
        System.out.println("Parent5 Method");
    }
}

class Child5 extends Parent5 {
    int x = 200;

    void method() {
        System.out.println("x=" + x);   // this.x와 같다.
        System.out.println("super.x=" + super.x);   // 조상클래스인 Parent5에 선언된 인스턴스변수x
        System.out.println("this.x=" + this.x);     // Child5클래스의 인스턴스변수 x
    }
}

/* 인스턴스변수에 직접 접근하면, 참조변수의 타입에 따라
   사용되는 인스턴스변수가 달라질 수 있으므로 주의해야 한다.
 */
// 실행결과
//p.x = 100
//x=200
//super.x=100
//this.x=200
//
//c.x = 200
//x=200
//super.x=100
//this.x=200