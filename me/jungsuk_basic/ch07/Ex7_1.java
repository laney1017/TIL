package me.jungsuk_basic.ch07;

class Tv {
    boolean power; // 전원상태(on/off)
    int channel; //채널

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
class SmartTv extends Tv { // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption; // 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다.
            System.out.println(text);
        }
    }
}

class Ex7_1 {
    public static void main(String args[]) {
        SmartTv stv = new SmartTv();
        stv.channel = 10; // 조상 클래스로부터 상속받은 멤버
        stv.channelUp(); // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true; // 캡션(자막) 기능을 켠다.
        stv.displayCaption("Hello, World");
    }
}
//실행결과
//11
//Hello, World
//Tv클래스로부터 상속받고 기능을 추가하여 SmartTv클래스 작성
//caption은 캡션긴으의 상태(on/off)를 저장하기 위한 boolean형 변수
//displayCaption(String text)은 매개변수로 넘겨받은 문자열(text)을 캡션이 켜져 있는 경우(caption의 값이 true인 경우)에만 화면에 출력한다.
//자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성.-> 따로 조상 클래스의 인스턴스를 생성하지 않고도 조상 클래스의 멤버들을 사용 가능