package me.jungsuk.ch06;

class Tv {
    // TV의 속성(멤버변수)
    String color;         // 색상
    boolean power;        // 전원상태(on/off)
    int channel;          // 채널

    // TV의 기능(메서드)
    void power() {
        power = !power;      // Tv를 켜거나 끄는 기능을 하는 메서드
    }
    void channelUp() {
        ++channel;          // Tv의 채널을 높이는 기능을 하는 메서드
    }
    void channelDown() {
        --channel;          // Tv의 채널을 낮추는 기능을 하는 메서드
    }
}

class Ex6_1 {
    public static void main(String[] args) {
        Tv t;               // Tv인스턴스를 참조하기 위한 참조변수 t를 선언, 메모리에 참조변수 t를 위한 공간이 마련된다.
        t = new Tv();       // Tv인스턴스를 생성한다.
                            // 연산자 new에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 이 때 멤버변수는 각 자료형에 해당하는 기본값으로 초기화된다.
                            // 대입연산자 = 에 의해 생성된 객체의 주소값이 참조변수 t에 저장된다.

        t.channel = 7;      // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
                            // 인스턴스의 멤버변수를 사용하려면 '참조변수.멤버변수'와 같이 하면 된다.

        t.channelDown();    // Tv인스턴스의 메서드 channelDown()을 호출한다.
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}
// Tv 클래스로부터 인스턴스를 생성하고 인스턴스의 속성과 메서드를 사용하는 방법
// 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.

// 실행결과
//현재 채널은 6 입니다.