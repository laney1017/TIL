package me.jungsuk_basic.ch12;

enum Direction { EAST, SOUTH, WEST, NORTH }

class Ex12_5 {
    public static void main(String[]args){
        Direction d1 = Direction.EAST;   // 열거형타입.상수이름
        Direction d2 = Direction.valueOf("WEST");    //valueOf(String name) 열거형상수이름으로 문자열 상수 참조
        Direction d3= Enum.valueOf(Direction.class, "EAST");  // java.lang.Enum(모든 열거형의 조상)

        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);

        System.out.println("d1==d2 ? " + (d1==d2));
        System.out.println("d1==d3 ? " + (d1==d3));
        System.out.println("d1.equals(d3) ? " + (d1.equals(d3)));
//      System.out.println("d2 > d3 ? " + (d2 > d3))); // 에러(비교연산자 불가)
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));   // 0-2=-2

        switch (d1) {
            case EAST: // Direction.EAST라고 쓸 수 없다.(문법)
                System.out.println("The direction is EAST.");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH.");
                break;
            case WEST:
                System.out.println("The direction is WEST.");
                break;
            case NORTH:
                System.out.println("The direction is NORTH.");
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }

        Direction[] dArr = Direction.values();   // 열거형의 모든 상수를 배열로 반환

        for (Direction d : dArr)  // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
    }
}

//실행화면
//d1=EAST
//d2=WEST
//d3=EAST
//d1==d2 ? false
//d1==d3 ? true
//d1.equals(d3) ? true
//d1.compareTo(d3) ? 0
//d1.compareTo(d2) ? -2
//The direction is EAST.
//EAST=0
//SOUTH=1
//WEST=2
//NORTH=3
