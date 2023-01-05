package me.jungsuk.ch07;

public class Ex7_16 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car;      // 컴파일은 OK. 실행 시 에러가 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
/* 형변환오류
   참조변수 car가 참조하고 있는 인스턴스가 Car타입의 인스턴스인데
   조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다.
 */
/* 서로 상속관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나,
   참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용되지 않는다.
 */

// 실행결과
//drive, Brrrr~
//java.lang.ClassCastException