package me.jungsuk.ch06;

class MyMath2 {
    long a, b;

    // 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add() { return a + b; }   // a, b는 인스턴스 변수
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    // 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) { return a + b; }     // a,b는 지역변수
    static long subtract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
 }

public class Ex6_19 {
    public static void main(String[] args) {
        // 클래스메서드 호출. 인스턴스 생성없이 호출가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200.0, 100.0));

        MyMath2 mm = new MyMath2();   // 인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
/* 인스턴스 메서드 : add(), subtract(), multiply(), divide()
   인스턴스 변수인 long a, b만으로도 작업이 가능하기 때문에, 매개변수를 필요로 하지 않으므로 괄호()에 매개변수를 선언하지 않았다.

   클래스 메서드 : add(long a, long b), subtract(long a, long b), multiply(long a, long b), divide(double a, doulbe b)
   인스턴스 변수 없이 매개변수만으로 작업을 수행하기 때문에 앞에 static을 붙여서 클래스메서드로 선언하였다.

   클래스메서드는 객체생성없이 바로 호출이 가능하고,
   인스턴스메서드는 MyMath2클래스의 인스턴스를 생성한 후에야 호출이 가능하다.
 */

// 실행결과
//300
//100
//20000
//2.0
//300
//100
//20000
//2.0
