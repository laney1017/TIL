package me.jungsuk.ch08;

public class Ex8_13 {
    public static void main(String[] args) {
        method1();  // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
    }

    static void method1(){
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
// 예외가 method1에서 발생했으며, main메서드가 method1을 호출했다.
//실행결과
//method1메서드에서 예외가 처리되었습니다.
//java.lang.Exception
//	at me.jungsuk.ch08.Ex8_13.method1(Ex8_13.java:10)
//	at me.jungsuk.ch08.Ex8_13.main(Ex8_13.java:5)