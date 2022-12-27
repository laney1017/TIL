package me.jungsuk.ch05;

public class Ex5_16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
/* 커맨드라인에 입력된 매개변수는
   공백문자로 구분한다. 입력될 값에 공백이 있는 경우 큰따옴표 " 로 감싸주어야 한다.
   숫자를 입력하더라도 숫자가 아닌 문자열로 처리된다.
   커맨드라인에 매개변수를 입력하지 않으면 크기가 0인 배열이 생성된다.
 */
// 실행결과1
//매개변수를 입력하지 않은 경우
//매개변수의 개수:0

// 실행결과2
// 인텔리제이 run > edit configurations > Program arguments에 abc 123 "Hello world"를 입력한 결과
//매개변수의 개수:3
//args[0] = "abc"
//args[1] = "123"
//args[2] = "Hello world"