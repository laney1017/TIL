package me.jungsuk.ch03;

public class Ex3_13 {
    public static void main(String[] args) {
        char c1 = 'a';

//      char c2 = c1 +1;
//      수식에 변수가 들어가 있는 경우 -> 컴파일러가 미리 계산을 할 수 없다. 형변환필요 -> char c2 = (char)(c1 + 1);

        char c2 = 'a' + 1;
//      상수 또는 리터럴 간의 연산은 실행과정동안 변하는 값이 아니기 때문에 컴파일러가 계산가능.
        System.out.println(c2);
    }
}
//실행결과
//b