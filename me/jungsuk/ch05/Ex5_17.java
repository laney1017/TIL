package me.jungsuk.ch05;

public class Ex5_17 {
    public static void main(String[] args) {
        if (args.length != 3) {   // 입력된 값의 개수가 3개가 아니면,
            System.out.println("usage: java Ex5_17 NUM1 OP NUM2");
            System.exit(0);      // 프로그램을 종료한다.
        }

        int num1 = Integer.parseInt(args[0]);      // 문자열을 숫자로 변환한다.
        char op = args[1].charAt(0);               // 문자열을 문자(char)로 변환한다.
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {        // switch문의 수식으로 char타입의 변수도 가능하다.
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
        }
        System.out.println("결과:" + result);
    }
}
/* 화면으로부터 사칙연산을 수행하는 수식을 입력받아 계산하여 결과를 보여주는 방법
   커맨드라인으로부터 입력받은 데이터는 모두 문자열이므로 숫자와 문자로 변환이 필요하다.
 */
// 실행결과1 커맨드라인에 아무것도 입력하지 않은 경우
// usage: java Ex5_17 NUM1 OP NUM2
// 실행결과2 커맨드라인(인텔리제이 edit configurations > Program arguments)에 10 + 3 을 입력한 경우
// 결과:13
// 실행결과3 커맨드라인(인텔리제이 edit configurations > Program arguments)에 10 x 3 을 입력한 경우
// 결과:30