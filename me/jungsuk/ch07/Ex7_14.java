package me.jungsuk.ch07;

final class Singleton {                // 상속할 수 없는 클래스
    private static Singleton s = new Singleton();       // getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static

    private Singleton() {       // 외부에서 생성자에 접근할 수 없으므로 인스턴스를 생성할 수 없게 된다.
        // ...
    }

    public static Singleton getInstance() {     // 인스턴스를 생성해서 반환해주는 public메서드를 제공, 인스턴스를 생성하지 않고도 호출될 수 있어야 하므로 static이어야 한다.
        if (s==null)
            s = new Singleton();

        return s;
    }
}

public class Ex7_14 {
    public static void main(String[] args) {
//        Singleton s = new Singleton();      // 에러. Singleton() has private access in Singleton
        Singleton s = Singleton.getInstance();
    }
}
