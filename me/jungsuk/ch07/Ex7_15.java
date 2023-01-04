package me.jungsuk.ch07;

public class Ex7_15 {
    public static void main(String[] args) {
        Car car = null;         // Car타입의 참조변수 car를 선언하고 null로 초기화한다.
        FireEngine fe = new FireEngine();   // FireEngine 인스턴스를 생성하고 FireEngine 타입의 참조변수가 참조하도록 한다.
        FireEngine fe2 = null;

        fe.water();

//      참조변수 fe가 참조하고 있는 인스턴스를 참조변수 car가 참조하도록 한다.fe의 값(fe가 참조하고 이는 인스턴스의 주소)이 car에 저장된다.
        car = fe;       // 조상타입<-자손타입. car = (Car)fe;에서 형변환이 생략된 형태다.
//      car.water();      컴파일에러. Car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine) car;     // 자손타임 <- 조상타입. 참조변수 car에는 FireEngine인스턴스의 주소가 저장되어 있으므로 참조변수 fe2에도 FireEngine인스턴스의 주소가 저장된다.
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {      // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {       // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {      // 소방차
    void water() {      // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}

// 실행결과
//water!!!
//water!!!