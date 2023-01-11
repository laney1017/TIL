package me.jungsuk.ch08;

public class Ex8_1 {
    public static void main(String[] args) {
        try {
            try {   } catch (Exception e) { }
        } catch (Exception e) {
//        try {   } catch (Exception e) { }   // 에러. 변수 e가 중복 선언되었따.
        }   // try-catch의 끝

        try {

        } catch (Exception e) {

        }   // try-catch의 끝
    }
}

/* catch블럭 내에 또 하나의 try-catch문이 포함된 경우, 같은 이름의 참조변수를 사용해서는 안 된다.
   각 cathch블럭에 선언된 두 참조변수의 영역이 서로 겹치므로 다른 이름을 사용해야만 서로 구별되기 때문이다.
 */