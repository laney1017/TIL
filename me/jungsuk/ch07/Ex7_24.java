package me.jungsuk.ch07;

public class Ex7_24 {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("f는 Unit클래스의 자손입니다.");

        if (f instanceof Fightable)
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");

        if (f instanceof Movable)
            System.out.println("f는 Movable인터페이스를 구현했습니다.");

        if (f instanceof Attackable)
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");

        if (f instanceof Object)
            System.out.println("f는 Object클래스의 자손입니다.");
    }
}

/* Fighter클래스는 Unit클래스로부터 상속받고, Fightable인터페이스만을 구현했지만
   Unit클래스는 Object클래스의 자손이고,
   Fightable인터페이스는 Attackable과 Movable인터페이스의 자손이므로
   Fighter클래스는 이 모든 클래스와 인터페이스의 자손이 된다.
 */
class Fighter extends Unit implements Fightable {
//    오버라이딩 할 때는 조상의 메서드보다 넓은 범위의 접근 제어자를 지정해야 한다. -> public abstract void move -> 구현 시 public
    public void move(int x, int y) { /* 내용 생략 */ }
    public void attack(Unit u) { /* 내용 생략 */ }
}

class Unit {
    int currentHP;  // 유닛의 체력
    int x;          // 유닛의 위치(x좌표)
    int y;          // 유닛의 위치(y좌표)
}

interface Fightable extends Movable, Attackable {  }
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }

// 실행결과
//f는 Unit클래스의 자손입니다.
//f는 Fightable인터페이스를 구현했습니다.
//f는 Movable인터페이스를 구현했습니다.
//f는 Attackable인터페이스를 구현했습니다.
//f는 Object클래스의 자손입니다.