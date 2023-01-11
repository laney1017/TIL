package me.jungsuk.ch08;

public class Ex8_7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);      // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
/* try-cath문의 마지막에
    Exception클래스 타입의 참조변수를 선언한 catch블럭을 사용하면,
    어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해 처리되도록 할 수 있다.
 */
// 첫 번째 검사에서 일치하는 catch블럭을 찾았기 때문에 두 번째 catch블럭은 검사하지 않게 된다.
// 실행결과
//1
//2
//3
//true
//ArithmeticException
//6