package me.jungsuk.ch03;

public class Ex3_16 {
    public static void main(String[] args) {
        float pi = 3.141592f;

        //실수형 pi 값을 소수점 셋째자리까지만 빼내는 방법(버림)
        float shortPi = (int) (pi * 1000) / 1000f;
      /*(int) (3141.592f) / 1000f;
        3141 / 1000f;
        3141.0f / 1000f;
       */
        System.out.println(shortPi);
    }
}
//실행결과
//3.141