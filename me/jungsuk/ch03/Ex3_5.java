package me.jungsuk.ch03;

public class Ex3_5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a+b);
        System.out.printf("%d - %d = %d%n", a, b, a-b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d%n", a, b, a/b); // int타입/int타입은 결과값도 int타입이므로 소수점 이하는 버림
        System.out.printf("%d + %f = %f%n", a, (float)b, a/(float)b);  // 한쪽을 실수형으로 형변환하면 다른한쪽도 실수형으로 자동 형변환되어 실수형의 값을 가진다.
    }
}
//실행결과
//10 + 4 = 14
//10 - 4 = 6
//10 * 4 = 40
//10 / 4 = 2
//10 + 4.000000 = 2.500000