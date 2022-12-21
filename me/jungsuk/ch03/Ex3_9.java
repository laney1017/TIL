package me.jungsuk.ch03;

public class Ex3_9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
//      int타입과 int타입의 연산결과는 int타입
//      결과값이 int타입 최대값인 2x10의9제곱 을 넘겨서 오버플로우가 발생한다.

        long b = 1_000_000 * 1_000_000L;
//      int타입과 long타입의 연산결과는 long타입
//      long타입의 저장범위는 -2의63제곱 ~ 2의63제곱-1 이므로 올바른 결과를 얻을 수 있다.

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
//실행결과
//a=-727379968
//b=1000000000000