package me.jungsuk.ch03;

public class Ex3_31 {
    public static void main(String[] args) {
        int dec = 1234;
        int hex = 0xABCD;
        int mask = 0xF;

        System.out.printf("hex=%X%n", hex);

//      비트AND연산자는 두 bit가 모두 1일 때만 1이 된다.
//      0xABCD 와 0x000F를 비트AND연산하면 마지막 자리만 남고 나머지자리는 모두 0이 된다.
//      0000000000001101
        System.out.printf("%X%n", hex & mask);

//      2진수 4자리는 16진수로 한자리에 해당한다. 0xABCD >> 4 -> 0x0ABC
        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);
    }
}
//쉬프트 연산자와 비트AND연산자를 이용해서 16진수를 끝에서부터 한자리씩 뽑아내는 방법
//실행결과
//hex=ABCD
//D
//C
//B
//A