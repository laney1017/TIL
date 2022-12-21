package me.jungsuk.ch03;

public class Ex3_23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf(" str1 ==\"abc\" ? %b%n",   str1 == "abc");

        System.out.printf(" str2 ==\"abc\" ? %b%n",   str2 == "abc");
//      내용은 같지만 서로 다른 객체라서 false를 반환한다.

        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));

        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
//      equals()는 객체가 달라도 내용이 같으면 true를 반환한다.

        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));

        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
//      대소문자를 구별하지 않고 비교하고 싶으면 equalsIgnoreCase()를 사룔하면 된다.
    }
}
//실행결과
//"abc"=="abc" ? true
// str1 =="abc" ? true
// str2 =="abc" ? false
//str1.equals("abc") ? true
//str2.equals("abc") ? true
//str2.equals("ABC") ? false
//str2.equalsIgnoreCase("ABC") ? true