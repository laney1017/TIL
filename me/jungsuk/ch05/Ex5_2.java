package me.jungsuk.ch05;

import java.util.Arrays;

public class Ex5_2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr4 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;      // 1~10의 숫자를 순서대로 배열에 넣는다.
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random()*10) + 1;     // 1~10의 값을 배열에 저장
        }

        //배열에 저장된 값들을 출력한다.
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
// 예외적으로 char배열은 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력된다.

// 실행결과
//1,2,3,4,5,6,7,8,9,10,
//[3, 7, 7, 4, 4, 7, 10, 5, 9, 6]
//[100, 95, 80, 70, 60]
//[a, b, c, d]
//[I@3498ed
//abcd