package me.jungsuk.ch03;

public class Ex3_20 {
    public static void main(String[] args) {
        System.out.println(-10 % 8);
        System.out.println(10 % -8);
        System.out.println(-10 % -8);
    }
}
//실행결과
//-2
//2
//-2

//나머지 연산자는 나누는 수로 음수도 허용한다.
//피연산자의 부호를 무시하고, 나머지 연산을 한 결과에 나눠지는 수의 부호를 붙이면 된다.