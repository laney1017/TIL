package me.jungsuk.ch08;

public class Ex8_11 {
    public static void main(String[] args) {
        throw new RuntimeException();   // RuntimeException을 고의로 발생시킨다.
    }
}
/* RuntimeException과 그 자손들에 해당하는 예외는
   프로그래머에 의해 실수로 발생하는 것들이기 때문에 예외처리를 강제하지 않는다.
   컴파일러가 예외처리를 확인하지 않는 RuntimeException클래스들은 unchecked예외라고 부른다.
 */

// 실행결과
//Exception in thread "main" java.lang.RuntimeException
//	at me.jungsuk.ch08.Ex8_11.main(Ex8_11.java:5)