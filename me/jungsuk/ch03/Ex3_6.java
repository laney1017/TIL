package me.jungsuk.ch03;

public class Ex3_6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//      byte c = a + b; 컴파일 에러 발생, 명시적으로 형변환이 필요
//      에러코드 java: incompatible types: possible lossy conversion from int to byte
//      피연산자의 타입이 int보다 작은 타입이면 int로 변환되므로
//      연산결과는 int형으로 4byte 값을 byte 1byte의 변수에 형변환없이 저장하려고 했기 때문에 에러 발생 -> 명시적 형변환 연산자를 사용해 변환해야한다.
        byte c = (byte)(a + b);
        System.out.println(c);
    }
}
//실행결과
//30