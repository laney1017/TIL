package me.jungsuk.ch09;

public class Ex9_5 {
    public static void main(String[] args) {
        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();

        System.out.println(str);
        System.out.println(str.toString()); // String클래스의 toString()은 Stringd인스턴스가 갖고 있는 문자열을 반환하도록 오버라이딩되어 있다.
        System.out.println(today);
        System.out.println(today.toString());   // Date클래스의 toString()은 Date인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 되어 있다.
    }
}
// 실행결과
//KOREA
//KOREA
//Mon Jan 23 23:33:11 KST 2023
//Mon Jan 23 23:33:11 KST 2023