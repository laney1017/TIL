package me.jungsuk.ch08;

public class Ex8_22 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;            // 다시 예외를 발생시킨다.
        }
    }
}
/* 예외 되던지기 : 하나의 예외에 대해서 예외가 발생한 메서드와 이를 호출한 메서드 양쪽 모두에서 처리해줘야 할 작업이 있을 때 사용
   주의! 예외가 발생할 메서드에서는 try-catch문을 사용해서 예외처리를 해줌과 동시에 메서드의 선언부에 발생할 에외를 throws에 지정해줘야 한다.
 */
// 실행결과
//method1메서드에서 예외가 처리되었습니다.
//main메서드에서 예외가 처리되었습니다.