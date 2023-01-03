package me.jungsuk.ch07;

public class Ex7_7 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

class Point1 {
    int x, y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :" +y;
    }
}

class Point3D extends Point1 {
    int z;

    Point3D(int x, int y, int z) {
//        super();         생성자 첫줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 자동으로 추가, Point3D의 조상인 Point클래스의 기본 생성자인 Point()를 의미한다.
//        그러나 Point클래스에 생성자 Point()가 정의되어 있지 않기 때문에 컴파일 에러가 발생한다.
//        에러를 수정하려면 1. Point클래스에 생성자 Point()를 추가해주던가
//        2. 생성자 Point3D(int x, int y, int z)의 첫 줄에서 Point(int x, int y)를 호출하도록 변경하면 된다.
        /*
        this.x = x;
        this.y = y;
         */
        super(x, y);        // 조상 클래스의 생성자 Point(int x, int y)를 호출한다.
        this.z = z;
    }

    String getLocation() {      // 오버라이딩
        return "x :" + x + ", y:" + y + ", z:" + z;
    }
}
