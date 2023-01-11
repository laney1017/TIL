package me.jungsuk.ch08;

public class Ex8_6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);      // 실행되지 않는다.
        } catch (Exception e) {         // ArithmeticException 대신 Exception을 사용
            System.out.println(5);
        }
        System.out.println(6);
    }
}
/* ArithmeticException 클래스는 Exception 클래스의 자손이므로
   ArithmeticException 인스턴스와 Exception 클래스와의 instanceof 연산결과가 true가 되어
   Exception 클래스타입의 참조변수를 선언한 catch블럭의 문장들이 수행되고 예외는 처리된다.
 */
// 실행결과
//1
//2
//3
//5
//6