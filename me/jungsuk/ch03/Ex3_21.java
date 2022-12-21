package me.jungsuk.ch03;

public class Ex3_21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f   \t %b%n", 10== 10.0f);
//      float타입으로 변환 후 비교 10.0f == 10.0f

        System.out.printf("'0'== 0       \t %b%n", '0'== 0);
//      '0'은 유니코드로 48 == 0

        System.out.printf("'A'== 65      \t %b%n", 'A'== 65);
//      'A'은 유니코드로 65 == 65

        System.out.printf("'A' > 'B'     \t %b%n", 'A' > 'B');
//      'A'는 유니코드로 65 'B'는 66      65 > 66

        System.out.printf("'A'+1 != 'B'  \t %b%n", 'A'+1 != 'B');
//      'A'는 유니코드로 65 'B'는 66   66 != 66
    }
}
//실행결과
//10 == 10.0f   	 true
//'0'== 0       	 false
//'A'== 65      	 true
//'A' > 'B'     	 false
//'A'+1 != 'B'  	 false