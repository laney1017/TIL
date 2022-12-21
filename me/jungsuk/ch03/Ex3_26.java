package me.jungsuk.ch03;

public class Ex3_26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
    }
}
//실행결과
//a=5, b=0
//a!=0 || ++b!=0 = true
//a=5, b=0
//a==0 && ++b!=0 = false
//a=5, b=0