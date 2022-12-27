package me.jungsuk.ch05;

public class Ex5_10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length-1; i++) {    // 비교작업이 한번 수행되는 것만으로는 정렬이 되지 않는다. 배열의 길이 -1만큼 반복해서 비교해야한다.
            boolean changed = false;       // 자리바꿈이 발생했는지를 체크한다.

            for (int j = 0; j < numArr.length-1-i; j++) {      // 비교작업을 반복할수록 비교해야하는 범위는 하나씩 줄어든다.-> numArr.length-1-i
                // numArr[j]와 바로 옆의 요소 numArr[j+1]을 비교한다.
                if (numArr[j] > numArr[j+1]) {      // 왼쪽의 값이 크면 서로 바꾼다.
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;       // 자리바꿈이 발생했으니 changed를 true로.
                }
            }

            if (!changed) break;    // 자리바꿈이 없으면 반복문을 벗어난다.

            for (int k = 0; k < numArr.length; k++)
                System.out.print(numArr[k]);   // 정렬된 결과를 출력한다.
            System.out.println();
        }
    }
}
/* 길이가 10인 배열에 0과 9사이의 임의의 값으로 채운 다움
   버블정렬 알고리즘을 통해서 크기수능로 정렬하는 방법
   버블정렬 : 근접한 값과 크기를 비교하여 자리바꿈을 반복한다.
 */

// 실행결과
//2487709932
//2477089329
//2470783299
//2407732899
//2047327899
//0243277899
//0232477899
//0223477899
