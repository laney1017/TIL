package me.jungsuk.ch09;

public class Ex9_3 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
/* String 클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록 hashCode메서드가 오버라이딩 되어 있다.
   -> 문자열의 내용이 같으면 항상 동일한 해시코드값을 얻는다.
   System.identityHashCod(Object x)는 객체의 주소값으로 해시코드르 생성한다.
   -> 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다.
 */
// 실행결과
//true
//96354
//96354
//1435804085
//1784662007