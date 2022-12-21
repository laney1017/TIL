package me.jungsuk.ch03;

public class Ex3_17 {
    public static void main(String[] args) {
        double pi = 3.141592;

//      소수점 넷째자리에서 반올림하는 방법
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;
        /* (int) (3141.592 + 0.5) / 1000.0;
            (int) (3142.092) / 1000.0;
            int / double
         */
        System.out.println(shortPi);
    }
}
//실행결과
//3.142