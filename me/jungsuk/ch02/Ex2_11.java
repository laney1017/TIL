package me.jungsuk.ch02;

public class Ex2_11 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);  //floatTmIntBits() float타입의 값을 int타입의 값으로 해석해서 반환

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i); // 16진수로 출력
    }
}
//실행결과
//9.123457
//4111F9AE