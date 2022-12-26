package me.jungsuk.ch04;

public class Ex4_30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // 무한반복문에는 조건문과 break문이 항상 같이 사용된다.
        while (true) {
            if (sum > 100)
                break;
            ++i;
            sum += i;
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
// 숫자를 1부터 계속 더해나가서 몇까지 더하면 합이 100을 넘는지 알아내는 방법
// 실행결과
//i=14
//sum=105