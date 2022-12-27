package me.jungsuk.ch05;

public class Ex5_19 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균 ");
        System.out.println("=================================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;       // 개인별 총점
            float avg = 0.0f;  // 개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i + 1);

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum / (float) score[i].length;     // 평균계산
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("=================================");
        System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}
/* 5명의 학생의 세 과목 점수를 더해서 각 학생의 총점과 평균을 계산하고
   과목별 총점을 계산하는 방법
 */

// 실행결과
//번호  국어  영어  수학  총점  평균
//=================================
//  1  100  100  100  300 100.0
//  2   20   20   20   60  20.0
//  3   30   30   30   90  30.0
//  4   40   40   40  120  40.0
//  5   50   50   50  150  50.0
//=================================
//총점:240  240  240