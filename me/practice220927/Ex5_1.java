package me.practice220927;
import java.util.Arrays;
public class Ex5_1 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a','b','c','d'};

        for (int i=0; i < iArr1.length; i++){
            iArr1[i] = i+1;                        // 1~10까지 숫자 순서대로 배열
        }
        for (int i=0; i < iArr2.length; i++){
            iArr2[i] = (int) (Math.random()*10) + 1;  // 1~10 숫자 랜덤 배열
        }
        for (int i=0; i < iArr1.length; i++){
            System.out.print(iArr1[i]+",");          // iArr1 배열값 쉼표로 구분해서 출력
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr1));  // iArr1 배열 값 출력. 메서드이용(import 추가필요)
        System.out.println(Arrays.toString(iArr2));  // iArr2 배열 값 출력. 메서드이용(import 추가필요)
        System.out.println(Arrays.toString(chArr));  // chArr 배열 값 출력. 메서드이용(import 추가필요)
        System.out.println(iArr3);          // 타입@주소 (배열을 가리키는 참조변수 iArr3값 출력)
        System.out.println(chArr);         // 예외적으로 char배열은 요소 출력
    }
}
