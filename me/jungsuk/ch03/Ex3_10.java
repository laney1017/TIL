package me.jungsuk.ch03;

public class Ex3_10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;  // 1000000 * 1000000 / 1000000
//      1000000 * 1000000 은 10의12제곱으로 int의 범위를 넘는다.  -> 오버플로우발생

        int result2 = a / a * a;  // 1000000 / 1000000 * 1000000

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }
}
//실행결과
//1000000 * 1000000 / 1000000 = -727
//1000000 / 1000000 * 1000000 = 1000000