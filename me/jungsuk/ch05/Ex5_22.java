package me.jungsuk.ch05;

public class Ex5_22 {
    public static void main(String[] args) {
        int[][] m1 = {         // 2행3열
                {1, 2, 3},
                {4, 5,6}
        };

        int[][] m2 = {         // 3행2열
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length;       // m1의 행 길이 2
        final int COL = m2[0].length;    // m2의 열 길이 2
        final int M2_ROW = m2.length;    // m2의 행 길이 3

        int[][] m3 = new int[ROW][COL];  // 곱셈연산의 결과인 행렬 m3의 행의 길이는 m1의 행의 길이와 같고, 열의 길이는 m2의 열의 길이와 같다.

        // 행렬곱 m1 x m2의 결과를 m3에 저장
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COL; j++)
                for (int k = 0; k < M2_ROW; k++)
                    m3[i][j] += m1[i][k] * m2[k][j];
                    // m3의 행index는 m1의 행index와 일치하고 m3의 열index는 m2의 열index와 일치한다.
                    // m3[0][0] = m1[0][0]*m2[0][0] = A0xa0
                    //          + m1[0][1]*m2[1][0] = A0xa0 + A1xb0
                    //          + m1[0][2]*m2[2][0] = A0xa0 + A1xb0 + A2xc0
                    // m3[0][1] = m1[0][0]*m2[0][1] = A0xa1
                    //        ...

        // 행력 m3를 출력
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3d ", m3[i][j]);
            }
            System.out.println();
        }
    }
}
/* 행렬의 곱셈
두 행렬의 곱셈이 가능하려면 m1의 열의 길이와 m2의 행의 길이가 같아야 한다
 */

// 실행결과
// 22  28
// 49  64