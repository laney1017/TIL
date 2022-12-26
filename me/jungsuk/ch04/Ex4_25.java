package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예:12345)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();     // 화면을 통해 입력받은 내용을 tmmp에 저장
        num = Integer.parseInt(tmp);         // 입력받은 문자열(tmp)을 숫자로 변환

        while (num != 0) {
            // num을 10으로 나눈 나머지를 sum에 더함
            sum += num%10;       // sum = sum + num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;     //  num = num/10;  num을 10으로 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리수의 합:" + sum);
    }
}
// 숫자의 각 자리의 합을 구하는 방법
/* 10으로 나머지 연산하면 마지막 자리를 얻을 수 있다.
   10으로 나누면 마지막 한자리가 제거된다.
 */
// 실행결과
//숫자를 입력하세요. (예:12345)>12345
//sum=  5 num=12345
//sum=  9 num=1234
//sum= 12 num=123
//sum= 14 num=12
//sum= 15 num=1
//각 자리수의 합:15