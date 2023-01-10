package me.jungsuk.ch07;

public class Ex7_26 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);       // SCV가 Tank를 수리하도록 한다.
        scv.repair(dropship);
//        scv.repair(marine);   // 에러! repair(Repairable) in SCV cannot be applied to (Marine)
    }
}

interface Repairable {}

class Unit1 {
    int hitPoint;
    final int MAX_HP;
    Unit1(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit1 {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnint extends Unit1 {
    AirUnint(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);     // Tank의 HP는 150이다.
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Tank";
    }
}

class Dropship extends AirUnint implements Repairable {
    Dropship() {
        super(125);     // Drpship의 HP는 125이다.
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);     // Marine의 HP는 40이다.
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV(){
        super(60);
        hitPoint = MAX_HP;
    }

    /* repair메서드의 매개변수 r은 Repairable타입이기 때문에 인터페이스 Repairable에 정의된 멤버만 사용할 수 있다.
       그러나 Repairable에는 정의된 멤버가 없으므로 이 타입의 참조변수로는 할 수 있는 일은 아무 것도 없다.
     */
    void repair(Repairable r) {

//      instanceof 연산자로 타입을 체크한 뒤 캐스팅하여 Unit클래스에 정의된 hitPoint와 MAX_HP를 사용할 수 있도록 한다.
        if (r instanceof Unit1) {
            Unit1 u = (Unit1)r;

//          유닛의 현재 체력(hitPoint)이 유닛이 가질 수 있는 최고 체력(MAX_HP)이 될 때까지 체력을 증가시킨다.
            while (u.hitPoint != u.MAX_HP) {
                /* Unit1의 HP를 증가시킨다. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}

// Marine은 Repairable인터페이스를 구현하지 않았으므로 SCV클래스의 repair메서드의 매개변수로 Marine을 사용하면 컴파일 시에 에러가 발생한다.

// 실행결과
//Tank의 수리가 끝났습니다.
//Dropship의 수리가 끝났습니다.