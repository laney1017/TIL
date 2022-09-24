package me.day03.practice;

import java.util.Scanner;

/* 사분면 판단 프로그램
        - 사용자에게 사분면 위의 두 점 `x, y`를 입력받아 어떤 사분면에 속하는지 판단하는 프로그램을 작성하시오.
        - 사분면 위의 점은 `실수값`이라고 가정
        - 1 사분면 위에 있으면 `1 사분면` 출력
        - 2 사분면 위에 있으면 `2 사분면` 출력
        - 3 사분면 위에 있으면 `3 사분면` 출력
        - 4 사분면 위에 있으면 `4 사분면` 출력
        - 만약 어떤 사분면 위에 있지 않고 x 축 위에 있으면 `x 축 위에 있음`을 출력
        - 만약 어떤 사분면 위에 있지 않고 y 축 위에 있으면 `y 축 위에 있음`을 출력
        - 원점이면 `원점`을 출력 */
public class Practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x, y;

        System.out.println("x값을 입력하세요.");
        x = scanner.nextDouble();
        System.out.println("y값를 입력하세요.");
        y= scanner.nextDouble();

        if (x>0) {
            if (y>0){
                System.out.println("1 사분면");
            } else if (y==0) {
                System.out.println("x축 위에 있음");
            } else {
                System.out.println("4 사분면");
            }
        } else if (x<0) {
            if (y>0){
                System.out.println("2 사분면");
            } else if (y==0) {
                System.out.println("x축 위에 있음");
            } else {
                System.out.println("3 사분면");
            }
        } else {
            if (!(y==0)) {
                System.out.println("x축 위에 있음");
            } else {
                System.out.println("원점");
            }
        }
    }
}
