package me.jungsuk_basic.ch08;

public class Ex8_12 {
    public static void main(String[] args) {
        try {
            method1();     // 던지기
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }
    static void method1() throws Exception {   // 예외 선언
        try {
            throw new Exception();   // 예외 발생
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;   // 다시 예외를 발생시킨다.
        }
    }  // method1 메서드의 끝
}
// 실행화면
// method1메서드에서 예외가 처리되었습니다.
// main메서드에서 예외가 처리되었습니다.
