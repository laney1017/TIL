package me.jungsuk.ch06;

public class Ex6_7 {
    public static void main(String[] args) {
        firstMethod();    // static메서드는 객체 생성없이 호출가능하다.
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}
/* 1. main메서드가 JVM에 의해 호출된다.
   2. main메서드에서 firstMethod()를 호출한다. main메서드는 대기상태가 되고 firstMethod()가 수행된다.
   3. firstMethod()에서 secondMethod()를 호출한다. firstMethod()는 대기상태가 되고 secondMethod()가 수행된다.
   4. secondMethod()에서 println()을 호출한다. println()이 수행되어 화면에 출력된다.
   5. println() 수행이 완료되어 호출스택에서 사라지고 secondMethod()로 되돌아간다.
   6. secondMethod()가 종료되고, 호출한 firstMethod()로 되돌아간다.
   7. firstMethod()가 종료되고, 호출한 main메서드로 되돌아간다.
   8. main메서드도 종료되고 호출스택은 완전히 비워지고 프로그램은 종료된다.
 */
// 실행결과
//secondMethod()