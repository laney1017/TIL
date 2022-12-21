package me.jungsuk.ch03;

public class Ex3_11 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' -'%c' = %d%n", d, a, d - a);  // 'd'-'a'=3
        System.out.printf("'%c' -'%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c'=%d%n", a, (int) a);
        System.out.printf("'%c'=%d%n", d, (int) d);
        System.out.printf("'%c'=%d%n", zero, (int) zero);
        System.out.printf("'%c'=%d%n", two, (int) two);
    }
}
//실행결과
//'d' -'a' = 3
//'2' -'0' = 2
//'a'=97
//'d'=100
//'0'=48
//'2'=50

//문자는 유니코드로 바뀌어 자장된다.