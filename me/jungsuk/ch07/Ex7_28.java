package me.jungsuk.ch07;

class A1 {
    void autoPlay(I i) {
        i.play();
    }
}
interface I {
    public abstract void play();
}
class B1 implements I{
    public void play() {
        System.out.println("play in B1 class");
    }
}

class C implements I{
    public void play() {
        System.out.println("play in C class");
    }
}

public class Ex7_28 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.autoPlay(new B1());       // void autoPlay(I i)호출
        a.autoPlay(new C());        // void autoPlay(I i)호출
    }
}

/* 클래스 A를 작성하는데 클래스 B가 관련되지 않았다.
   클래스 A가 인터페이스 I를 사용해서 작성되긴 하였지만, 매개변수를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 동적으로 제공받아야 한다.
 */
// 실행결과
//play in B1 class
//play in C class