package me.jungsuk.ch05;

public class Ex5_6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];       // 배열의 첫 번째 값으로 최대깂을 초기화 한다.
        int min = score[0];       // 배열의 첫 번째 값으로 최소값을 초기화 한다.

        for (int i = 1; i < score.length; i++) {  // 배열의 두 번째 값부터 비교하기 위해 i=1
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
    }
}
// 배열에 저장된 값 중에서 최대값과 최소값을 구하는 방법
/* 배열의 첫 번째 요소 score[0]의 값으로 최대값과 최소값의 변수를 초기화
   반복문을 통해 배녕릐 두 번째 요소 score[1]부터 비교한다.
*/
// 실행결과
//최대값 :100
//최소값 :33