package me.jungsuk.ch08;

public class Ex8_12 {
    public static void main(String[] args) throws Exception{
        method1();  // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
/* 예외를 메서드의 throws에 명시하는 것은 자신을 호출한 메서드에게 예외를 전달하여 예외처리를 떠맡기는 것이다.
   main메서드에서도 예외처리가 되지 않으면, main 메서드마저 종료되어 프로그램이 전체가 종료된다.
 */
//실행결과
//Exception in thread "main" java.lang.Exception
//	at me.jungsuk.ch08.Ex8_12.method2(Ex8_12.java:13)
//	at me.jungsuk.ch08.Ex8_12.method1(Ex8_12.java:9)
//	at me.jungsuk.ch08.Ex8_12.main(Ex8_12.java:5)