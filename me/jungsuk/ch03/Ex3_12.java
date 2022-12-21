package me.jungsuk.ch03;

public class Ex3_12 {
    public static void main(String[] args) {
        char c1 = 'a';     //c1에는 문자 'a'의 유니코드값인 97이 저장된다.
        char c2 = c1;      //c1에 저장되어 있는 값이 c2에 저장된다.
        char c3 = ' ';     //c3을 공백으로 초기화한다.

        int i = c1 + 1;   // 'a'+1 -> 97+1 ->98

        c3 = (char) (c1 + 1);
        c2++;
        c2++;
//      c2++ 대신 c2=c2+1 을 사용하면 에러가 발생한다.
//      c2+1의 연산결과는 int형이며 c2에 다시 담으려면 char형으로 형변환이 필요하기 때문

        System.out.println("i=" + i);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }
}
//실행결과
//i=98
//c2=c
//c3=b