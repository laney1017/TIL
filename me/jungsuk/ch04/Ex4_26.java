package me.jungsuk.ch04;

public class Ex4_26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
// 1부터 몇까지 더하면 누적합계가 100이 넘지 않는 제일 큰 수가 되는지 알아내는 방법
// 실행결과
//1 - 1
//2 - 3
//3 - 6
//4 - 10
//5 - 15
//6 - 21
//7 - 28
//8 - 36
//9 - 45
//10 - 55
//11 - 66
//12 - 78
//13 - 91