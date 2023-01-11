package me.jungsuk.ch08;

public class Ex8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);      // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
// try블럭에서 예외가 발생하면, 예외가 발생한 위치 이후에 있는 try블럭의 문장들은 수행되지 않는다.
// 실행결과
//1
//2
//3
//5
//6