package me.jungsuk.ch02;

public class Ex2_4 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;     // 8진수 10, 10진수로는 8
        int hexNum = 0x10;    // 16진수 10, 10진수로는 16
        int binNum = 0b10;    // 2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);       // %d 10진정수로 출력 %n 줄바꿈
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int) c); // %c 문자로 출력 char값을 int타입으로 형변환해야만 %d로 출력할 수 있다.
        System.out.printf("finger=[%5d]%n", finger);  // 5자리로 출력
        System.out.printf("finger=[%-5d]%n", finger); // 왼쪽정렬로 5자리
        System.out.printf("finger=[%05d]%n", finger); // 5자리중 빈공간을 0으로출력
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);  // '#'은 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum); // %o 8진정수로 출력
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // %x 16진정수로 출력
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
        // 10진수를 2진수로 출력해주는 지시자는 없기 때문에, 정수를 2진 문자열로 변환해주는 Integer.toBinaryString(int i)를 사용한다. 이 메서드는 문자열로 반환하므로 %s 문자열로 출력
    }
}
//실행결과
//b=1
//s=2
//c=A, 65
//finger=[   10]
//finger=[10   ]
//finger=[00010]
//big=100000000000
//hex=0xffffffffffffffff
//octNum=10, 8
//hexNum=10, 16
//binNum=10, 2