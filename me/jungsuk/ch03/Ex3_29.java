package me.jungsuk.ch03;

import static java.lang.Integer.toBinaryString;

public class Ex3_29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;

//      %d 10진정수로 출력
//      비트 전환 연산자 ~  피연산자를 2진수로 표현했을 때, 0은 1로 1은 0으로 바꾼다.

//      양의 정수 p에 대한 음의 정수를 얻으려면 ~p+1
        System.out.printf(" p  =%d \t%s%n", p,     toBinaryString(p));
        System.out.printf("~p  =%d \t%s%n", ~p,    toBinaryString(~p));
        System.out.printf("~p+1=%d \t%s%n", ~p+1,  toBinaryString(~p+1));

//      ~~p는 원래의 값이 된다. 연산결과의 타입은 int
        System.out.printf("~~p =%d \t%s%n", ~~p,  toBinaryString(~~p));
        System.out.println();

//      음의 정수 n의 양의 정수를 얻으려면 ~(n-1)
        System.out.printf(" n  =%d%n",    n);
        System.out.printf("~(n-1)=%d%n", ~(n-1));
    }

    //10진 정수를 2진수로 변환하는 메서드
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}

//실행결과
// p  =10 	00000000000000000000000000001010
//~p  =-11 	11111111111111111111111111110101
//~p+1=-10 	11111111111111111111111111110110
//~~p =10 	00000000000000000000000000001010
//
// n  =-10
//~(n-1)=10