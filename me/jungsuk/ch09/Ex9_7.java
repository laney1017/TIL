package me.jungsuk.ch09;

class Point implements Cloneable {  // 1.Cloneable 인터페이스를 구현한다.

    // Clonealbe인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
    // 이 인터페이스를 구현하지 않고 clone()만 호출하면 예외가 발생한다. (이유: 인스턴스의 데이터를 보호하기 위해서)
    // Cloneable인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미
    int x,y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public Object clone() {     // 2.접근제어자를 protected에서 public으로 변경
        Object obj = null;
        try {                   // clone()은 반드시 예외처리를 해주어야 한다.
            obj = super.clone();    // 3.try-catch내에서 조상클래스의 clone()을 호출
        } catch (CloneNotSupportedException e) { }
        return obj;
    }

}

public class Ex9_7 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();  // 복제(clone)해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}

//실행결과
//x=3, y=5
//x=3, y=5
