package me.practice220927;

public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0;              // 총합 저장 변수
        float average = 0f;       // 평균 저장 변수

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0;i < score.length; i++){
            sum += score[i];           // score[0]=100, score[1]=88, .... score[4]=90  값의 총합
        }
        average = sum / (float)score.length;    // 계산결과를 float로 변환하지 않으면 int타입으로 결과값이 나오므로 정확하지않다.

        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+average);
    }
}
