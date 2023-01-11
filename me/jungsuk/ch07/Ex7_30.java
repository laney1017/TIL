package me.jungsuk.ch07;


public class Ex7_30 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child extends Parent1 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child");   // 오버라이딩
    }
}

class Parent1 {
    public void method2() {
        System.out.println("method2() in Parent1");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }
    default void method2() {
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}

// 실행결과
//method1() in Child
//method2() in Parent1
//staticMethod() in MyInterface
//staticMethod() in MyInterface2