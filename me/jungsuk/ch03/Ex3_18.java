package me.jungsuk.ch03;

public class Ex3_18 {
    public static void main(String[] args) {
        double pi = 3.141592;

//      소수점 넷째자리에서 반올림
        double shortPi = Math.round(pi * 1000) / 1000.0;
        /* Math.round(3141.592) / 1000.0
           3242 / 1000.0
           int / double
         */
        System.out.println(shortPi);
    }
}
//실행결과
//3.142

//round메서드는 매개변수로 받은 값을 소수점 첫째자리에서 바올림하고 결과를 정수로 돌려준다.