package me.jungsuk.ch06;

public class Ex6_21 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과:"   + mm.add(3, 3));
        System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));      // 6L이지만 리터럴의 접미사는 출력되지 않으므로 6이 출력된다.
        System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));      // 6L이지만 리터럴의 접미사는 출력되지 않으므로 6이 출력된다.
        System.out.println("mm.add(3L, 3L) 결과 " + mm.add(3L, 3L));     // 6L이지만 리터럴의 접미사는 출력되지 않으므로 6이 출력된다.

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a+b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a+b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a+b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) {       // 배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}

// 실행결과
//int add(int a, int b) - mm.add(3, 3) 결과:6
//long add(long a, int b) - mm.add(3L, 3) 결과: 6
//long add(int a, long b) - mm.add(3, 3L) 결과: 6
//long add(long a, long b) - mm.add(3L, 3L) 결과 6
//int add(int[] a) - mm.add(a) 결과: 600