package me.jungsuk.ch06;

class Data4 {        // 생성자 0개 -> 컴파일러가 기본생성자 Data4() {} 자동 추가
    int value;
}

class Data5 {         // 생성자 1개 Data5(int x)가 정의되어 있으므로 기본생성자가 추가되지 않는다.
    int value;

    Data5(int x) {     // 매개변수가 있는 생성자
        value = x;
    }
}

public class Ex6_23 {
    public static void main(String[] args) {
        Data4 d4 = new Data4();       // Data4 d4 = new Data4();
//      Data5 d5 = new Data5();       // 컴파일 에러 발생. Data5 d5 = new Data5(10);     OK
    }
}

/* 컴파일 에러가 발생하지 않도록 하기 위해서는
   Data5(int x)를 사용하던가 아니면 클래스 Data5에 생성자 Data5()를 추가로 정의해 줘야 한다.
 */
