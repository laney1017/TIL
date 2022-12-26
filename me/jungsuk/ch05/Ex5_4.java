package me.jungsuk.ch05;

public class Ex5_4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열 (result)로 만든다.
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        // num의 인덱스6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
/* 배열의 복사
   System 클래스의 arraycopy() 사용
   어브 배열의 몇 번째 요소에서 어느 배열로 몇 번째 요소로 몇 개의 값을 복사할 것인지 지정해줘야 한다.
   복사하려는 내용보다 여유 공간이 적으면 에러(ArrayIndexOutOfBoundsException)가 발생한다.
 */

// 실행결과
//ABCD
//0123456789
//ABCD0123456789
//ABCD456789
//ABCD45ABC9