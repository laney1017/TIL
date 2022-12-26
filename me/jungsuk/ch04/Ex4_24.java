package me.jungsuk.ch04;

public class Ex4_24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);
            for (int j = 0; j < 2_000_000_000; j++) {
                ;
            }
        }
        System.out.println("GAME OVER");
    }
}
// 10부터 0까지 1씩 감소시켜가면서 출력을 하되, for문으로 매 출력마다 약간의 시간이 지연되도록 하는 방법

// 실행결과
//10
//9
//8
//7
//0
//GAME OVER