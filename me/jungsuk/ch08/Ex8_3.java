package me.jungsuk.ch08;

public class Ex8_3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");    // ArithmeticException이 발생하면 실행되는 코드
            }
        }
    }
}
// 실행결과
//100
//33
//20
//100
//25
//20
//14
//0   <- ArithmeticException이 발생해서 0이 출력됨
//20
//14