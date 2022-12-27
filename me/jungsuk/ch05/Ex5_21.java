package me.jungsuk.ch05;

import java.util.Scanner;

public class Ex5_21 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        // 5x5 크기의 2차원배열을 만든다.
        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
//        {{ 1,2,3,4,5 }
//        ,{ 6,7,8,9,10 }
//        ,{ 11,12,13,14,15 }
//        ,{ 16,17,18,19,20 }
//        ,{ 21,22,23,24,25 } }
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                bingo[i][j] = i * SIZE + j + 1;

        // 배열에 저장된 값을 뒤섞는다. (shuffle)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);    // 0<= x <5
                y = (int) (Math.random() * SIZE);    // 0<= y <5

                // bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {     // 1번은 실행될 생성된 빙고판
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++)
                    System.out.printf("%2d ", bingo[i][j]);
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE * SIZE);
            String tmp = scanner.nextLine();      // 화면에서 입력받은 내용을 tmp에 저장
            num = Integer.parseInt(tmp);          // 입력받은 문자열(tmp)을 숫자로 변환

            // 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;  // 2중 반복문을 벗어난다.
                    }
                }
            }
        } while (num != 0);
    }
}
/* 빙고
1. 5x5크기의 빙고판에 1~25의 숫자를 차례로 저장한 다음, Math.random()을 이용해서 저장된 값의 위치를 섞는다.
2. 사용자로부터 숫자를 입력받아 일치하는 숫자가 빙고판에 있으면 해당 숫자를 0으로 바꾼다.
3. 배열의 첫 번째 요소부터 순서대로 하나씩 비교하다 일치하는 숫자를 찾으면, 값을 0으로 바꾸고 break문으로 반복문을 빠져나온다.
4. 이중반복문이므로 이름 붙은 break문을 사용해야 한다.
 */

// 실행결과
//14  6 22 12 10
//20 25 24  7  3
// 8  5 17 21  2
//11 23 16 15 19
// 1 13 18  4  9
//
//1~25의 숫자를 입력하세요. (종료:0)>1
//14  6 22 12 10
//20 25 24  7  3
// 8  5 17 21  2
//11 23 16 15 19
// 0 13 18  4  9
//
//1~25의 숫자를 입력하세요. (종료:0)>9
//14  6 22 12 10
//20 25 24  7  3
// 8  5 17 21  2
//11 23 16 15 19
// 0 13 18  4  0
//
//1~25의 숫자를 입력하세요. (종료:0)>0