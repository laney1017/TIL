package me.jungsuk.ch08;

public class Ex8_2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int)(Math.random() * 10);    // 7번째 라인
            System.out.println(result);
        }
    }
}

/* ArithmeticException은 산술연산과정에서 오류가 있을 때 발생하는 예외
   정수는 0으로 나누는 것이 금지되어 있다.
   그러나 실수를 0으로 나누는 것은 가능하다.
 */
// 실행결과
//11
//33
//11
//25
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at me.jungsuk.ch08.Ex8_2.main(Ex8_2.java:9)