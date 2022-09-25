package me.practice220924;
//영수증에 적힌,구매한 각 물건의 가격과 개수,구매한 물건들의 총 금액
//을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
//첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.

import java.util.Scanner;
public class practice25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();     //총금액
        int n = sc.nextInt();     // 구매물건 종류 수

        for (int i=0;i<n;i++){
            int a = sc.nextInt();   // 각 물건 가격
            int b = sc.nextInt();   // 각 물건 개수
            x = x - a*b;
        }
        if (x == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
