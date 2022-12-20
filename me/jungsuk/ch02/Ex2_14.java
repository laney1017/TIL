package me.jungsuk.ch02;

public class Ex2_14 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f =%20.18f\n", f);
        System.out.printf("d =%20.18f\n", d);
        System.out.printf("d2 =%20.18f\n", d2);
    }
}
//실행결과
//f =9.123456954956055000
//d =9.123456700000000000
//저장할 때 이미 값이 달라졌기 때문에 형변환을 해도 값이 같아지지 않는다.
//d2 =9.123456954956055000