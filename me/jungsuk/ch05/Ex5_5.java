package me.jungsuk.ch05;

public class Ex5_5 {
    public static void main(String[] args) {
        int sum = 0;      // 총점을 저장하기 위한 변수
        float average = 0f;  // 평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;  // 계산결과를 float로 얻기 위해서 형변환

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
// for문을 이용해서 배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나누어서 평균을 구하는 방법
// int와 int간의 연산은 int를 결과로 얻기 때문에 정확한 평균값을 얻지 못한다 -> float로 형변환해서 계산
// 실행결과
//총점 : 478
//평균 : 95.6