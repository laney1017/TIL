package me.jungsuk.ch03;

import static java.lang.Integer.toBinaryString;

public class Ex3_28 {
    public static void main(String[] args) {
        int x = 0xAB, y = 0xF;      // 16진수 0x

//      '#'은 접두사, %X 16진 정수 영문자를 대문자로 출력, \t tab, %s 문자열로 출력, toBinaryString(); 2진 문자열로 변환
        System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));

//      비트OR연산자 |  피연산자 중 한쪽의 값이 1이면, 1을 결과로 얻는다. 그 외에는 0을 얻는다.
        System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));

//      비트AND연산자 &  피연산자 양쪽이 모두 1이어야만 1을 결과로 얻는다. 그 외에는 0을 얻는다.
        System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));

//      비트XOR연산자 ^  피연산자으 값이 서로 다를 때만 1을 결과로 얻는다. 같을 때는 0을 얻는다.
        System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));

//      XOR연산자를 한번 더 실행하면 원래의 값으로 돌아온다.
        System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
    }

    static String toBinaryString(int x) { // 10진 정수를 2진수로 변환하는 메서드
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}

//실행결과
//x = 0XAB 		00000000000000000000000010101011
//y = 0XF 		00000000000000000000000000001111
//0XAB | 0XF = 0XAF 	00000000000000000000000010101111
//0XAB & 0XF = 0XB 	00000000000000000000000000001011
//0XAB ^ 0XF = 0XA4 	00000000000000000000000010100100
//0XAB ^ 0XF ^ 0XF = 0XAB 	00000000000000000000000010101011