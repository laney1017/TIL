package me.jungsuk.ch06;

public class Ex6_17 {
    public static void main(String[] args) {
        main(null);        // 재귀호출. 자기 자신을 다시 호출한다.
    }
}
/* main메서드에서 아무 조건없이 게속해서 재귀호출을 하는 경우
   호출스택의 메모리 한계를 넘게 되고 StackOverflowError가 발생
   프로그램은 비정상적으로 종료된다.
 */


// 실행결과
//Exception in thread "main" java.lang.StackOverflowError
//	at me.jungsuk.ch06.Ex6_17.main(Ex6_17.java:5)
//	at me.jungsuk.ch06.Ex6_17.main(Ex6_17.java:5)
//	at me.jungsuk.ch06.Ex6_17.main(Ex6_17.java:5)
//	at me.jungsuk.ch06.Ex6_17.main(Ex6_17.java:5)
//	at me.jungsuk.ch06.Ex6_17.main(Ex6_17.java:5)
// ...