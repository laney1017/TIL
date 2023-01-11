package me.jungsuk.ch08;

public class Ex8_8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // 예외발생
            System.out.println(4);      // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            ae.printStackTrace();   // 참조변수 ae를 통해, 생성된 ArithmeticException인스턴스에 접근할 수 있다.
            System.out.println("예외메시지 : " + ae.getMessage());
        }
        System.out.println(6);
    }
}
/* try-catch문으로 예외처리를 하여 예외가 발생해도 비정상적으로 종료하지 않도록 해주는 동시에,
    printStackTrace() 또는 getMessage()와 같은 메서드를 통해서 예외의 발생원인을 알 수 있다.
 */
// 실행결과
//1
//2
//3
//java.lang.ArithmeticException: / by zero
//	at me.jungsuk.ch08.Ex8_8.main(Ex8_8.java:9)
//예외메시지 : / by zero
//6