package me.jungsuk.ch07;

public class Ex7_19 {
    public static void main(String[] args) {
        Parent4 p = new Child4();
        Child4 c = new Child4();

        // 자손클래스에서 조상클래스의 멤버를 중복으로 정의하지 않았을 때는 참조변수의 타입에 따른 변화는 없다.
        // 참조변수의 타입에 관계없이 조상의 멤버들을 사용하게 된다.
        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent4 {
    int x = 100;

    void method() {
        System.out.println("Parent3 Method");
    }
}

class Child4 extends Parent4 { }    // Child4클래스에 아무런 멤버,메서드가 정의되어 있지 않다.

// 실행결과
//p.x = 100
//Parent3 Method
//c.x = 100
//Parent3 Method