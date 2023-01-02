package me.jungsuk.ch06;

public class Ex6_20 {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//  static int cv2 = iv;       // 에러. 클래스변수는 인스턴스변수를 사용할 수 없음.
    static int cv2 = new Ex6_20().iv;      // 이처럼 객체를 생성해야 사용가능.

    static void staticMethod1() {
        System.out.println(cv);
//      System.out.println(iv);       // 에러. 클래스메서드에서 인스턴스변수를 사용불가.
        Ex6_20 c = new Ex6_20();
        System.out.println(c.iv);     // 객체를 생성한 후에야 인스턴스변수의 참조가능.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);         // 인스턴스메서드에서는 인스턴스변수를 바로 사용가능.
    }

    static void staticMethod2() {
        staticMethod1();
//      instanceMethod1();         // 에러. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
        Ex6_20 c = new Ex6_20();
        c.instanceMethod1();       // 인스턴스를 생성한 후에야 호출할 수 있음.
    }

    void instanceMethod2() {         // 인스턴스메서드에서는 인스턴스메서드와 클래스메서드
        staticMethod1();             // 모두 인스턴스 생성없이 바로 호출이 가능하다.
        instanceMethod1();
    }
}
/* 실제로는 같은 클래스 내에서 클래스 멤버가 인스턴스멤버를 참조 또는 호출해야 하는 경우는 드물다.
   만일 이런 경우가 발생한다면, 인스턴스메서드로 작성해야할 메서드를 클래스메서드로 작성한 것은 아닌지 확인해볼것!
 */

/* 클래스멤버(클래스변수와 클래스메서드)는 언제나 참조 또는 호출이 가능하다.
   인스턴스멤버가 클래스멤버를 사용하는 것은 문제가 없다.
   클래스멤버간의 참조 또는 호출 역시 문제가 없다.
   그러나, 인스턴스멤버(인스턴스변수와 인스턴스메서드)는 반드시 객체를 생성한 후에만 참조 또는 호출이 가능하다.
   클래스 멤버가 인스턴스멤버를 참조, 호출하기 위해서는 객체를 생성해야 한다.
   하지만, 인스턴스멤버간의 호출에는 아무런 문제가 없다. 하나의 인스턴스멤버가 존재한다는 것은
   인스턴스가 이미 생성되어있다는 것을 의미하며, 즉 다른 인스턴스멤버들도 모두 존재하기 때문이다.
 */