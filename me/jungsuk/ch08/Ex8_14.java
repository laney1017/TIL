package me.jungsuk.ch08;

public class Ex8_14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception{
        throw new Exception();
    }
}
//실행결과
//main메서드에서 예외가 처리되었습니다.
//java.lang.Exception
//	at me.jungsuk.ch08.Ex8_14.method1(Ex8_14.java:14)
//	at me.jungsuk.ch08.Ex8_14.main(Ex8_14.java:6)