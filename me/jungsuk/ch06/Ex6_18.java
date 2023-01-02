package me.jungsuk.ch06;

public class Ex6_18 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }

        System.out.println(result);
    }

    static long power(int x, int n) {
        if (n==1) return x;
        return x * power(x, n-1);
    }
}
/* x의 1제곱부터 x의 n제곱까지의 합을 구하는 방법
   f(x, n) = x * f(x, n-1)
   단, f(x, 1) = x
   예를 들어 2의 4제곱을 구하는 경우
   f(2, 4) = 2 * f(2, 3)
   f(2, 4) = 2 * 2 * f(2, 2)       // f(2,3) = 2*f(2,2)
   f(2, 4) = 2 * 2 *  2 * f(2, 1)  // f(2,2) = 2*f(2,1)
   f(2, 4) = 2 * 2 *  2 * 2        // f(2,1)은 2
 */

// 실행결과
//62