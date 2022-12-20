package me.jungsuk.ch02;

public class Ex2_7 {
    public static void main(String[] args) {
        char ch = 'A';   // char ch = 65;
        int code = (int)ch;   //ch에 저장된 값을 int타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#X)%n", ch, code, code);     //16진수로 0x41

        char hch = '가';    //char hch = 0xAC00;
        System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch); //16진수로 0xAC00
    }
}
//실행결과
//A=65(0X41)
//가=44032(0XAC00)