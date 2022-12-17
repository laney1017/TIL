package me.jungsuk_basic.ch07;

public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
class Parent {
    int x = 10;  /* super.x */
}

class Child extends Parent {
    int x = 20; // this.x

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
//실행결과
//x=20
//this.x=20
//super.x=10
//조상 Parent클래스와 Child클래스의 멤버이 x 이름이 동일->super을 사용해서 구분
//super 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수