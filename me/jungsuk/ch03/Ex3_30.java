package me.jungsuk.ch03;

public class Ex3_30 {
//  10진 정수를 2진수로 변환하는 메서드
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }

    public static void main(String[] args) {
        int dec = 8;

        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

//      int 타입 4byte(32bit), 자리수를 32번 바꾸면 제자리로 돌아오기 때무네 8 >> 32는 아무 일도 하지 않는다.
        dec = 8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
    }
}
//실행결과
//8 >> 0 =    8 	00000000000000000000000000001000
//8 >> 1 =    4 	00000000000000000000000000000100
//8 >> 2 =    2 	00000000000000000000000000000010
//8 << 0 =    8 	00000000000000000000000000001000
//8 << 1 =   16 	00000000000000000000000000010000
//8 << 2 =   32 	00000000000000000000000000100000
//
//-8 >> 0 =   -8 	11111111111111111111111111111000
//-8 >> 1 =   -4 	11111111111111111111111111111100
//-8 >> 2 =   -2 	11111111111111111111111111111110
//-8 << 0 =   -8 	11111111111111111111111111111000
//-8 << 1 =  -16 	11111111111111111111111111110000
//-8 << 2 =  -32 	11111111111111111111111111100000
//
//8 >> 0 =    8 	00000000000000000000000000001000
//8 >> 32 =    8 	00000000000000000000000000001000