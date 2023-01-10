package me.jungsuk.ch07;

public class Ex7_29 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.methodA2();
    }
}

class A2 {
    void methodA2() {
        I1 i = InstanceManager.getInstance();    // 제3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
        i.methodB2();
        System.out.println(i.toString());       // i로 Object클래스의 메서드 호출가능
    }
}

interface I1 {
    public abstract void methodB2();
}

class B2 implements I1 {
    public void methodB2(){
        System.out.println("methodB2 in B2 class");
    }

    public String toString() { return "class B"; }
}

// 제3의 클래스
class InstanceManager {
    public static I1 getInstance() {
        return new B2();
    }
}

/* 인스턴스를 직접 생성하지 않고. getInstance()라는 메서드를 통해 제공받는다.
   나중에 다른 클래스의 인스턴스로 변경되어도 A클래스의 변경없이 getInstance()만 변경하면 된다는 장점이 있다.
 */

// 실행결과
//methodB2 in B2 class
//class B