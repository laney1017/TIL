package me.jungsuk.ch07;


public class Ex7_5 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.method();
    }
}

class Parent {
    int x = 10;
}

class Child1 extends Parent {
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}

// 실행결과
//x=10
//this.x=10
//super.x=10