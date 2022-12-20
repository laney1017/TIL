package me.jungsuk.ch02;

public class Ex2_10 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("       123456789012345678901234%n");
        System.out.printf("f   : %f%n", f);   // 소수점이하 6째자리까지 출력
        System.out.printf("f   : %24.20f%n", f);
        System.out.printf("f2  : %24.20f%n", f2);
        System.out.printf("d   : %24.20f%n", d);
    }
}
//실행결과
// %f 는 소수점 이하 6자리까지만 출력(7번째 자리에서 반올림)
//       123456789012345678901234
//f   : 9.123457
//f   :   9.12345695495605500000
//f2  :   1.23456788063049320000
//d   :   9.12345678901234600000