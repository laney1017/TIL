package me.jungsuk.ch05;

public class Ex5_7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;  // 배열을 0~9의 숫자로 초기화한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);     // 0~9중의 한 값을 임의로 얻는다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;           // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
/* 두 변수에 저장된 값을 서로 바꾸려면, 별도의 저장공간(tmp)이 하나 더 필요하다.
   길이가 10인 배열 numArr을 생성하고 0~9의 숫자로 차례대로 초기화하여 출력한다.
   random()을 이용해서 배열의 임의의 위치에 있는 값 numArr[n]과 배열의 첫 번쨰 요소인 numArr[0]의 값을 교환한다.
 */
// 실행결과
//0123456789
//3549107286