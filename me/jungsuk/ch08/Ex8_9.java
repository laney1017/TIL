package me.jungsuk.ch08;

public class Ex8_9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;        // 예외를 발생시킴
//            throw new Exception("고의로 발생시켰음.");    // 위 두줄을 한 줄로 줄여 쓸 수 있따.
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
/* Exception인스턴스를 생성할 떄, 생성자에 String을 넣어주면, 이 String이 Exception인스턴스에 메시지로 저장된다.
   이 메시지는 getMessage()를 이용해서 얻을 수 있따.
 */
// 실행결과
//에러 메시지 : 고의로 발생시켰음.
//java.lang.Exception: 고의로 발생시켰음.
//	at me.jungsuk.ch08.Ex8_9.main(Ex8_9.java:6)
//프로그램이 정상 종료되었음.