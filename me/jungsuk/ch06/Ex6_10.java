package me.jungsuk.ch06;

class Data2 { int x; }

public class Ex6_10 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() :  x = " + d.x);

        change(d);            // change메서드를 호출하면서 참조변수 d의 값이 저장된 주소를 매개변수 d에 복사함.
        System.out.println("After change(d)");
        System.out.println("main() :  x = " + d.x);
    }

    static void change(Data2 d) {    // 참조형 매개변수 : 매개변수 d에 저장된 주소값으로 x에 접근가능.
        d.x = 1000;             // 매개변수 d로 x의 값을 1000으로 변경
        System.out.println("change() : x = " + d.x);
//      change메서드가 종료되면서 매개변수 d는 스택에서 제거됨.
    }
}

/* main메서드의 참조변수 d와 change메서드의 참조변수 d는 같은 주소로 같은 객체를 가리키게 된다.
   참조형 매개변수는 변수의 값을 읽고 변경할 수 있다.(read & write)
 */

// 실행결과
//main() :  x = 10
//change() : x = 1000
//After change(d)
//main() :  x = 1000