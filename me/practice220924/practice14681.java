package me.practice220924;
//첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
//점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
import java.util.Scanner;
public class practice14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x>0){
            if (y>0){
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (y>0){
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
