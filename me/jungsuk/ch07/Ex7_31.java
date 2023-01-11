package me.jungsuk.ch07;

public class Ex7_31 {
    class InstanceInner {
        int iv = 100;
//        static int cv = 100;    // 에러! static변수를 선언할 수 없다.
        final static int CONST = 100;   // final static은 상수이므로 허용
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;    // static클래스만 static멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300;    // 에러! static변수를 선언할 수 없다.
            final static int CONST = 300;   // final static은 상수이므로 허용
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
/* 내부 클래스 중에서 스태틱 클래스만 static멤버를 가질 수 있다.
   다만, final과 static이 동시에 붙은 변수는 상수이므로 모든 내부 클래스에서 정의가 가능하다.
 */

// 실행결과
//100
//200