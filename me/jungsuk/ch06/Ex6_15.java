package me.jungsuk.ch06;

public class Ex6_15 {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n) {
        int result = 0;

        if (n == 1)
            result = 1;
        else
            result = n * factorial(n-1);    // 다시 메서드 자신을 호출한다.
        return result;
    }
}
/* 팩토리얼을 계산하는 메서드를 구현하는 방법
   factorial 메서드가 static 메서드이므로 인스턴스를 생성하지 않고 직접 호출할 수 있다.
   main메서드와 같은 클래스에 있기 때문에 static메서드를 호출할 때 클래스이름을 생략하는 것이 가능하다.
   Factorial.factorial(n-1) 대신 factorial(n-1)
*/
// 실행걸과
// 24