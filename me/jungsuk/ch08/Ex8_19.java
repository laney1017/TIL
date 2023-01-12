package me.jungsuk.ch08;

public class Ex8_19 {
    public static void main(String[] args) {
        // method1()dms static메서들이므로 인스턴스 생성없이 직접 호출이 가능하다.
        Ex8_19.method1();
        System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");
    }

    static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            return;     // 현재 실행 중인 메서드를 종료한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally블럭이 실행되었습니다.");
        }
    }
}
/* try블럭에서 return문이 실행되는 경우에도 finally블럭의 문장들이 먼저 실행된 후에, 현재 실행중인 메서드를 종료한다.
   이와 마찬가지로 catch블럭의 문장 수행 중에 return문을 만나도 finally블럭의 문장들은 수행된다.
 */
// 실행결과
//method1()이 호출되었습니다.
//method1()의 finally블럭이 실행되었습니다.
//method1()의 수행을 마치고 main메서드로 돌아왔습니다.