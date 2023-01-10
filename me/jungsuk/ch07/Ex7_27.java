package me.jungsuk.ch07;

class A {
    public void methodA(B b) {
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}
public class Ex7_27 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
/* 클래스 A(User)는 클래스 B(Provider)의 인스턴스를 생성하고 메서드를 호출한다.
   두 클래스는 서로 직접적이 관계에 있다.
   직접적이 관계의 두 클래스는 한 쪽(Provider)가 변경되면 다른 한 쪽(User)도 변경되어야 한다는 단점이 있다.
 */

// 실행결과
//methodB()