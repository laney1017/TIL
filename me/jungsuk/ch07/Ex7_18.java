package me.jungsuk.ch07;

public class Ex7_18 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);     // 인스턴스변수 x는 참조변수의 타입에 따라 달라진다.
        p.method();     // 메서드는 참조변수의 타입에 관계없이 실제 이스턴스의 타입인 Child클래스에 정의된 메서드가 호출된다.

        System.out.println("c.x = " + c.x);     // 인스턴스변수 x는 참조변수의 타입에 따라 달라진다.
        c.method();     // 메서드는 참조변수의 타입에 관계없이 실제 이스턴스의 타입인 Child클래스에 정의된 메서드가 호출된다.
    }
}

class Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent3 Method");
    }
}

class Child3 extends Parent3 {
    int x = 200;

    void method() {
        System.out.println("Child3 Method");
    }
}

// 실행결과
//p.x = 100
//Child3 Method
//c.x = 200
//Child3 Method