package me.jungsuk.ch05;

public class Ex5_15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                        , "..-.", "--.", "....", "..", ".---"
                        , "-.-", ".-..", "--", "-.", "---"
                        , ".--.", "--.-", ".-.", "...", "-"
                        , "..-", "...-", ".--", "-..-", "-.--"
                        , "--.."    };
        String result="";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("souce:" + source);
        System.out.println("morse:" + result);
    }
}
/* 문자열String을 모르스morse 부호로 변환하는 방법 (16진수를 2진수로 변환하는 방법과 같다)
   i=0일 때
    result += morse[source.charAt[0] -'A'];
   >result += morse['S' - 'A'];         // 83-65=18
   >result += morse[18];
   >result += "...";
 */
// 실행결과
//souce:SOSHELP
//morse:...---.........-...--.