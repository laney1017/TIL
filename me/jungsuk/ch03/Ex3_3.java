package me.jungsuk.ch03;

public class Ex3_3 {
    public static void main(String[] args) {
        int i=5, j=5;
        System.out.println(i++);
        System.out.println(++j);
        /* System.out.println(i);
                            i++;
                            ++j;
           System.out.println(j); 와 같다.
         */
        System.out.println("i = " + i + ", j = " + j);
    }
}
//실행결과
//5
//6
//i = 6, j = 6
