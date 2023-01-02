package me.jungsuk.ch06;

public class Ex6_27 {
    static {     // 클래스 초기화 블럭
        System.out.println("static {    }");
    }

    {  // 인스턴스 초기화 블럭
        System.out.println("{   }");
    }

    public Ex6_27() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_27 bt = new Ex6_27(); ");
        Ex6_27 ex = new Ex6_27();

        System.out.println("Ex6_27 bt2 = new Ex6_27(); ");
        Ex6_27 ex2 = new Ex6_27();
    }
}
/* Ex6_27이 메모리에 로딩될 떄,
   1. 클래스 초기화 블럭이 가장 먼저 수행된다. -> static {} 이 출력
   2. main메서드가 수행되어 Ex6_27인스턴스가 생성된다.
   3. 인스턴스 초기화 블럭이 먼저 수행된다.
   4. 끝으로 생성자가 수행된다.
 */

/* 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되지만,
   인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행된다.
 */

// 실행결과
//static {    }
//Ex6_27 bt = new Ex6_27();
//{   }
//생성자
//Ex6_27 bt2 = new Ex6_27();
//{   }
//생성자