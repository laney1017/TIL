package me.jungsuk.ch06;

public class Ex6_8 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음.");
    }

    static void firstMethod() {
        System.out.println("firstMethod()이 시작되었음.");
        secondMethod();
        System.out.println("firstMethod()이 끝났음.");
    }

    static void secondMethod() {
        System.out.println("secondMethod()이 시작되었음.");
        System.out.println("secondMethod()이 끝났음.");
    }
}
// 각 메서드의 시작과 종료의 순서를 확인하는 방법

// 실행결과
//main(String[] args)이 시작되었음.
//firstMethod()이 시작되었음.
//secondMethod()이 시작되었음.
//secondMethod()이 끝났음.
//firstMethod()이 끝났음.
//main(String[] args)이 끝났음.