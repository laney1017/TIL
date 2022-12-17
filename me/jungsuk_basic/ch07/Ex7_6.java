package me.jungsuk_basic.ch07;

import static java.lang.System.out;
import static java.lang.Math.*;

public class Ex7_6 {
    public static void main(String[] args) {
        out.println(random());   // System.out.println(Math.random()); 과 동일

        out.println("Math.PI :" + PI); // System.out.println("Math.PI :" + Math.PI); 와 동일
    }
}
//실행결과
//0.6226864556790155
//Math.PI :3.141592653589793
//static import문을 사용하면 static멤버를 호출할 때 클래스 이름을 생략할 수 있다.
