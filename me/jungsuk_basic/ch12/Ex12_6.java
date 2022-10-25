package me.jungsuk_basic.ch12;

enum Direction2 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
    // value, symbol

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;
    Direction2(int value, String symbol) { // 접근 제어자 private이 생략됨
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {return value; }
    public String getSymbol() {return symbol; }

    public static Direction2 of(int dir) {   // of(메서드선언)
        if (dir < 1 || dir > 4)   // 0~3 범위를 벗어나면 예외발생
            throw new IllegalArgumentException("Invalid valud :" + dir);
        return DIR_ARR[dir - 1];
    }

    // 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
    public Direction2 rotate(int num) {
        num = num % 4;  // 1~4   예: 5%4 -> 1

        if (num < 0) num += 4; // num이 음수일 때는 시계반대 방향으로 회전
        // -1인경우 -1+4=3  반시계방향 한번은 시계방향 세번회전과 같다
        return DIR_ARR[(value-1+num) % 4];
    }

    public String toString() {
        return name()+getSymbol();
    }
} // enum Direction2

class Ex12_6 {
    public static void main(String[] args) {
        for (Direction2 d : Direction2.values())
            System.out.printf("%s=%d%n", d.name(), d.getValue());

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d1=%s, %d%n", d2.name(), d2.getValue());
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));
    }
}

//실행화면
//EAST=1
//SOUTH=2
//WEST=3
//NORTH=4
//d1=EAST, 1
//d1=EAST, 1
//SOUTHV
//WEST<
//NORTH^
//WEST<