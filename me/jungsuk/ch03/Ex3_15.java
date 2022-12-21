package me.jungsuk.ch03;

public class Ex3_15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase - 32);     // char형과 int형의 연산결과는 int형이므로 char형으로 형변환이 필요하다.
        System.out.println(upperCase);
    }
}
//실행결과
//A

// 대문자와 소문자 가느이 코드값 차이는 10진수로 32이다.