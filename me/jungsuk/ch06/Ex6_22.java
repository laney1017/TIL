package me.jungsuk.ch06;

public class Ex6_22 {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("["+concatenate(",", new String[0]) + "]");
        System.out.println("["+concatenate(",")+"]");
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }

    /*  아래 오버로딩한 메서드를 주석처리 하지 않으면 메서드를 호출했을 때, 구별되지 못하는 경우가 발생하기 때문에 컴파일 에러가 발생한다.
        가능하면 가변인자를 사용한 메서드는 오버로딩하지 않는 것이 좋다.
    static String concatenate(String... args) {
        return concatenate("", args);
    }
     */
}
/* concatenate메서드는 매개변수로 입력된 문자열에 구분자를 사이에 포함시켜 결합해서 반환한다.
   가변인자로 매개변수를 선언했기 때문에 문자열을 개수의 제약없이 매개변수로 지정할 수 있다.
 */

/* String[] strArr = new String[] {"100", "200", "300"};
   System.out.println(concatenate("-", strArr);

   System.out.println(concatenate("-", new String[] {"100", "200", "300"})};  // 위 두 문장을 이렇게 하나로 쓸 수 있다.
   System.out.println(concatenate("-", {"100, "200", "300"}));  // 이렇게 쓰면 안된다.
 */

// 실행결과
//100200300
//100-200-300-
//1,2,3,
//[]
//[]