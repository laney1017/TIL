package me.jungsuk.ch04;

public class Ex4_21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i==j) {
                    System.out.printf("[%d,%d]", i, j);
                } else {
                    System.out.printf("%5c",' ');
                }
            }
            System.out.println();
        }
    }
}
// i==j를 만족하는 경우에만 i와 j값을 출력하고 나머지는 공백을 출력하는 방법

// 실행결과
//[1,1]
//     [2,2]
//          [3,3]
//               [4,4]
//                    [5,5]
