package me.jungsuk.ch05;

public class Ex5_14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);   // src의 i번째 문자를 ch에 저장
            System.out.println("src.charAt(" + i + "):" + ch);
        }

        // String을 char[]로 변환
        char[] chArr = src.toCharArray();

        // char배열(char[])을 출력
        System.out.println(chArr);
    }
}
/* String 클래스의 charAt(int idx)을 사용하는 방법
   charAt(int idx)은 문자열 중에서 idx번째 위치에 있는 문자를 반환한다.
   println()로 문자배열을 출력하면 문자배열의 모든 요소를 이어서 한 줄로 출력한다.
 */
// 실행결과
//src.charAt(0):A
//src.charAt(1):B
//src.charAt(2):C
//src.charAt(3):D
//src.charAt(4):E
//ABCDE