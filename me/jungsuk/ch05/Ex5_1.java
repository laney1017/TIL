package me.jungsuk.ch05;

public class Ex5_1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;      // scroe[3] = 70
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];     // int tmp = score[3] + score[4]

//      for문으로 배열의 모든 요소를 출력한다.
        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }

        System.out.printf("tmp:%d%n", tmp);
        System.out.printf("score[%d]:%d%n", 7, score[7]);    // index의 범위를 벗어난 값
    }
}
// 유효하지 않은 값을 index로 사용하면, 실행시에 에러(ArrayindexOutOfBoundsException)가 발생한다.

// 실행결과
//score[0]:50
//score[1]:60
//score[2]:70
//score[3]:80
//score[4]:90
//tmp:170
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
//	at me.jungsuk.ch05.Ex5_1.main(Ex5_1.java:22)