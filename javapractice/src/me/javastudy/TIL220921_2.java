package me.javastudy;

public class TIL220921_2 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x"+x);
        System.out.println("y"+y);
    }
}
