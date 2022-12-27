package me.jungsuk.ch05;

import java.util.Arrays;

public class Ex5_9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11 };      // 불연속적인 값들로 구성된 배열
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * code.length);
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
/* 불연속적인 범위의 값들로 배열을 채우는 방법
   배열 code에 불연속적인 값들을 담고, 임의로 선택된 index에 저장된 값으로
   배열 arr의 요소들을 하나씩 채우면 된다.
   배열 arr에는 배열 code에 저장된 값들 중의 하나가 임의로 선택되어 저장된다.
 */
// 실행결과
//[6, 6, 3, 6, 6, -4, -1, -4, 3, -1]
