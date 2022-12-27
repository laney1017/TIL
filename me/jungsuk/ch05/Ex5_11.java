package me.jungsuk.ch05;

public class Ex5_11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);     // 0~9의 임의의 수를 배열에 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println( i + "의 개수 :" + counter[i]);
        }
    }
}
/* 빈도수 구하기
   길이가 10인 배열을 만들고 0과 9사이의 임의의 값으로 초기화한다.
   이 배열에 저장된 각 숫자가 몇 번 반복해서 나타나는지를 세어서 배열 counter에 담은 다음 화면에 출력한다.
   배열 counter의 각 요소에는 해당 인덱스의 값이 몇 번 나타났는지 알 수 있는 값이 저장된다.
 */

// 실행결과
//0447688777
//0의 개수 :1
//1의 개수 :0
//2의 개수 :0
//3의 개수 :0
//4의 개수 :2
//5의 개수 :0
//6의 개수 :1
//7의 개수 :4
//8의 개수 :2
//9의 개수 :0