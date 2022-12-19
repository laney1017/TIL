package me.jungsuk.ch07;

public class Ex7_4 {
}
/*class Tv {
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
class VCR {
    boolean power; // 전원상태(on/off)
    int counter = 0;
    void power() {
        power = !power;
    }
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}
class TVCR extends Tv {
    VCR vcr = new VCR();  // VCR클래스를 포함시켜서 사용한다.
    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}*/
//자바는 다중상속을 허용하지 않는다. -> Tv클래스를 조상으로 하고, VCR클래스는 TVCR클래스에 포함
//TVCR클래스에 VCR클래스의 메서드와 일치하는 선언부를 가진 메서드를 선언하고 내용은 VCR클래스의 것을 호출해서 사용
//외부적으로 TVCR클래스의 인스턴스를 사용하는 것처럼 보이지만 내부적으로는 VCR클래스의 인스턴스를 생성해서 사용하는 것이다.
//->VCR클래스의 메서드 내용이 변경되더라도 TVCR클래스의 메서드들 역시 변경된 내용이 적용된다.