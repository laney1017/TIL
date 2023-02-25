package me.jungsuk.ch09;

import java.util.Arrays;

public class Ex9_8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();   // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}

/* 배열도 객체이기 때문에
Object클래스를 상속받으며, Cloneable인터페이스와 Serializable인터페이스가 구현되어 있다.
Object클래스에는 protected로 정의되어 있는 clone()을 배열에서는 public으로 오버라이딩 했기 때문에 직접 호출이 가능하다.
 */

//실행결과
//[1, 2, 3, 4, 5]
//[6, 2, 3, 4, 5]
