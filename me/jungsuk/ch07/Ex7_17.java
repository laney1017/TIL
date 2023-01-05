package me.jungsuk.ch07;

public class Ex7_17 {
    public static void main(String[] args) {
        FireEngine1 fe = new FireEngine1();

        if (fe instanceof FireEngine1) {
            System.out.println("This is a FireEngine1 instance.");
        }
        if (fe instanceof Car1) {
            System.out.println("This is a Car1 instance.");
        }
        if (fe instanceof Object) {
            System.out.println("This is an Object instance");
        }

        System.out.println(fe.getClass().getName());    // 클래스의 이름을 문자열로 반환한다.
    }
}
class Car1 {}
class FireEngine1 extends Car1 {}

/* FireEngine1클래스는 Object클래스와 Car1클래스의 자송 클래스이다.
   조상의 멤버들을 상속받았기 때문에, FireEngine인스턴스는 Object인스턴스와 Cara인스턴스를 포함하고 있는 셈이다.
   검사한 타입으로 형변환이 가능하다.
 */
// 실행결과
//This is a FireEngine1 instance.
//This is a Car1 instance.
//This is an Object instance
//ch07.FireEngine1