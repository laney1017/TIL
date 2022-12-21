package me.jungsuk.ch03;

public class Ex3_7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b);
        System.out.println(c);
    }
}
//실행결과
//44

//결과값 300은 byte형의 범위(-128~127)를 넘기 때문에 값손실이 발생한다-> byte 형의 범위 중 한 값을 가지게 된다.