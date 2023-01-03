package me.jungsuk.ch07;

class Ex7_2 {          // class DrawShape
    public static void main(String[] args) {
        Point[] p = {   new Point(100, 100),
                        new Point(140, 50),
                        new Point(200, 100)
        };

        Triangle t = new Triangle(p);

        /* Point p = new Point(150, 150);
           Circle c = new Circle(p, 50);
           위 두문장을 하나로 합치면 아래와 같다.
         */
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw();      // 삼각형을 그린다.
        c.draw();      // 원을 그린다.
    }
}

class Shape {       // 도형을 의미하는 class
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {       // 2차원 좌표에서의 점을 의미하는 class
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0, 0);
    }
    String getXY() {
        return "("+x+","+y+")";   // x와 y의 값을 문자열로 반환
    }
}

class Circle extends Shape {        // 원은 도형이다.(is-a관계 -> 상속)
    Point center;       // 원의 원점좌표   // 원은 점을 가지고 있다.(has-a관계 -> 포함)
    int r;              // 반지름

    Circle() {
        this(new Point(0,0), 100);    // Circle(Point center, int r)를 호출
    }
    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {    // 원을 그리는 대신에 원의 정보를 출력하도록 했다. 오버라이딩(조상클래스인 Shape클래스에 정의된 draw메서드와 같은 메서드를 자손 클래스에 정의하는것)
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];       // 3개의 Point인스턴스를 담을 배열을 생성한다.

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}

// 실행결과
//[p1=(100,100), p2=(140,50), p3=(200,100), color=black]
//[center=(150, 150), r=50, color=black]