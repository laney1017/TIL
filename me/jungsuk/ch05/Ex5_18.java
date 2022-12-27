package me.jungsuk.ch05;

public class Ex5_18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }
        for (int[] tmp : score) {        // score의 각 요소(1차원 배열의 주소)를 tmp에 저장
            for (int i : tmp) {          // tmp는 1차원 배열을 가리키는 참조변수
                sum += i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
/* 2차원 배열 score의 모든 요소의 합을 구하고 출력하는 방법
    향상된 for문으로 배열의 각 요소에 저장된 값들을 순차적으로 읽어올 수는 있지만
    배열에 저장된 값을 변경할 수는 없다.
 */
// 실행결과
//score[0][0]=100
//score[0][1]=100
//score[0][2]=100
//score[1][0]=20
//score[1][1]=20
//score[1][2]=20
//score[2][0]=30
//score[2][1]=30
//score[2][2]=30
//score[3][0]=40
//score[3][1]=40
//score[3][2]=40
//sum=570