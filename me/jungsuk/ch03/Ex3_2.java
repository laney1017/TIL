package me.jungsuk.ch03;

public class Ex3_2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++;
        /* j=i;
           i++; 와 같다.
         */
        System.out.println("j=i+=; 실행후, i=" + i + ", j=" + j);

        i = 5;    // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        j = 0;

        j = ++i;
        /* ++i;
           j=i; 와 같다.
         */
        System.out.println("j=++i; 실행후, i=" + i + ", j=" + j);
    }
}
//실행결과
//j=i+=; 실행후, i=6, j=5
//j=++i; 실행후, i=6, j=6