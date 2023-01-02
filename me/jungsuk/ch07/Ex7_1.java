package me.jungsuk.ch07;

class Tv {
    boolean power;  // 전원상태(on/off)
    int channel;    // 채널

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv {       // Tv클래스로부터 상속받고 기능을 추가한 클래스
    boolean caption;       // 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) {     // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

class Ex7_1 {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();    // 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성된다.
        ctv.channel = 10;                // 조상클래스로부터 상속받은 멤버
        ctv.channelUp();                 // 조상클래스로부터 상속받은 멤버
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;              // 캡션(자막)기능을 켠다.
        ctv.displayCaption("Hello, World");
    }
}

/* 자손 클래스의 인스턴스를 생성하면, 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진
   하나의 인스턴스로 생성된다.
   -> 따로 조상클래스의 인스턴스를 생성하지 않고도 조상 클래스의 멤버들을 사용할 수 있다.
 */

//실행결과
//11
//Hello, World