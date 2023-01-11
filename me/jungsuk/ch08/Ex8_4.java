package me.jungsuk.ch08;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);  // 실행되지 않는다.
        }
        System.out.println(6);
    }
}
// 예외가 발생하지 않았으므로 catch블럭의 문장이 실행되지 않았다.
// 실행결과
//1
//2
//3
//4
//6