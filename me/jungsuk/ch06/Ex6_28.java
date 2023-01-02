package me.jungsuk.ch06;

public class Ex6_28 {
    static int[] arr = new int[10];        // 명시적 초기화
    
    static {          // 클래스 초기화블럭
        for (int i = 0; i < arr.length; i++) {
        // 1과 10사이의 임의의 값을 배열 arr에 저장한다.
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] :" + arr[i]);
        }
    }
}

// 실행결과
//arr[0] :9
//arr[1] :5
//arr[2] :3
//arr[3] :3
//arr[4] :4
//arr[5] :10
//arr[6] :6
//arr[7] :4
//arr[8] :8
//arr[9] :9