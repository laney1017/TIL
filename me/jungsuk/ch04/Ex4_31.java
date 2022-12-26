package me.jungsuk.ch04;

public class Ex4_31 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                // 조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동한다.
                continue;
            System.out.println(i);
        }
    }
}
// 1과 10사이의 숫자를 출력하되 그 중에서 3의 배수인 것은 제외하는 방법
// continue문과 반복문 블럭의 끝'}' 사이의 문장들을 건너뛰고 반복을 이어간다.

// 실행결과
//1
//2
//4
//5
//7
//8
//10