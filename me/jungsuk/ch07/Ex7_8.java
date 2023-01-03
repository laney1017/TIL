package me.jungsuk.ch07;

public class Ex7_8 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point2 {
    int x = 10;
    int y = 20;

    Point2(int x, int y) {
//      super();        생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 자동으로 삽입한다. Object 클래스의 기본 생성자인 Object()를 의미한다.
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point2 {
    int z = 30;

    Point3D2() {
        this(100, 200, 300);    // Point3D2(int x, int y, int z)를 호출한다.
    }

    Point3D2(int x, int y, int z) {
        super(x, y);        // Point2(int x, int y)를 호출한다.
        this.z = z;
    }
}
/* 어떤 클래스의 인스턴스를 생성하면, 클래스 상속관계의 최고조상인 Object클래스까지 거슬러 올라가면서
   모든 조상클래스의 생성자가 순서대로 호출된다.
 */
// 실행결과
//p3.x=100
//p3.y=200
//p3.z=300