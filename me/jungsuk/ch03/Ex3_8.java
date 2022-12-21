package me.jungsuk.ch03;

public class Ex3_8 {
    public static void main(String[] args) {
        int a = 1_000_000;     // 1,000,000 1백만
        int b = 2_000_000;     // 2,000,000 2백만

        long c = a * b;       // a * b = 2,000,000,000,000

        System.out.println(c);
    }
}
//실행결과
//-1454759936

//int타입과 int타입의 연산결과는 int타입이다.
//a * b 의 결과가 이미 int값이므로 long형으로 자동 형변환되어도 값은 변하지 않는다.
//올바른 결과를 얻으려면 a 또는 b의 타입을 long으로 형변환해야 한다.
//long c = (long)a * b; 또는 long c = a * (long)b;