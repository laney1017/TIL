package me.jungsuk.ch02;

public class Ex2_12 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score=" + score);
        System.out.println("d=" + d);
    }
}
//실행결과
//score=85
//d=85.4
//피연산자인 변수d의 값은 형변환 후에도 아무런 변화가 없다.