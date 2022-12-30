package me.jungsuk.ch06;

public class Ex6_11 {
    public static void main(String[] args) {

        int[] x = {10};    // 크기가 1인 배열. x[0] = 10;
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) {      // 참조형 매개변수
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }
}
/* 임시로 간단히 처리할 때는 별도의 클래스를 선언하는 것보다 배열을 이용할 수도 있다.
   배열도 객체와 같이 참조변수를 통해 데이터가 저장된 공간에 접근한다.
   변수 x도 int배열타입의 참조변수다.
 */

// 실행 결과
//main() : x = 10
//change() : x = 1000
//After change(x)
//main() : x = 1000