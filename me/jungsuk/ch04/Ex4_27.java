package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;    // while문의 조건식으로 사용될 변수
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");

        while (flag) {          // flag의 값이 true이므로 조건식은 참이 된다.
            System.out.print(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;       // num이 0이 아니면, sum에 더한다.
            } else {
                flag = false;     // num이 0이면, flag의 값을 false로 변경.
            }
        }
        System.out.println("합계:" + sum);
    }
}
// 사용자로부터 반복해서 숫자를 입력받다가 0을 입력하면 입력을 마치고 총합을 출력하는 방법
// while문의 조건식의 변수가 고정된 값을 유지하므로 무한반복문과 같다. -> 특정조건을 만족할 때 반복을 멈추게 하는 if문이 반복문 안에 필요
// 실행결과
//합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)
//>>100
//>>200
//>>300
//>>400
//>>0
//합계:1000