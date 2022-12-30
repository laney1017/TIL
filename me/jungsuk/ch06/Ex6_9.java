package me.jungsuk.ch06;

class Data { int x; }

public class Ex6_9 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);              // change메서드가 호출되면서 d.x가 change메서드의 매개변수 x에 복사됨.
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {       //  change(10), 기본형 매개변수
        x = 1000;              // x의 값을 1000으로 변경
        System.out.println("change() : x = " + x);
//      change메서드가 종료되면서 매개변수 x는 스택에서 제거됨.
    }
}
/* 자바에서는 메서드를 호출할 때, 매개변수로 지정한 값을 메서드의 매개변수에 '복사'해서 넘겨준다.
   d.x의 값이 변경된 것이 아니라, change메서드의 매개변수 x의 값이 변경된 것이다.
   원본이 아닌 복사본이 변경된 것 -> 원본에는 아무런 영향을 미치지 못한다.
   기본형 매개변수는 변수에 저장된 값만 읽을수 있을 뿐 변경할 수는 없다.(read only)
 */

// 실행결과
//main() : x = 10
//change() : x = 1000
//After change(d.x)
//main() : x = 10