package me.jungsuk.ch04;

public class Ex4_14 {
    public static void main(String[] args) {
        for (int i=1,j=10;i<=10;i++,j--)
            System.out.printf("%d \t %d%n", i, j);
    }
}
// 아래 문장으로 간단히 바꿀 수 있다.
// for(int i=1;i<=10;i++){
//      System.out.printf(%d \t %d%n", i, 11-i);
// }

// 실행결과
//1 	 10
//2 	 9
//3 	 8
//4 	 7
//5 	 6
//6 	 5
//7 	 4
//8 	 3
//9 	 2
//10 	 1