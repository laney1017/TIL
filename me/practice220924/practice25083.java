package me.practice220924;
//이스케이프 시퀀스(escape sequence) 또는 확장열은 컴퓨터와 주변 기기의 상태를 바꾸는 데에 쓰이는 일련의 문자열이다.
//이스케이프 시퀀스는 이스케이프 문자를 이용하여 이를 따르는 문자들의 뜻을 바꿀 수 있는데, 여기서 문자들은 데이터가 아닌 실행 명령어로 해석할 수 있다.
//뒤의 문자가 특수문자임을 알리기 위해 \(백슬래시)를 사용한다.
public class practice25083 {
    public static void main(String[] args) {
        System.out.println("         ,r\'\"7");       // 작은따옴표 \'  큰따옴표 \""
        System.out.println("r`-_   ,\'  ,/");
        System.out.println(" \\. \". L_r'");         // 역슬래시를 문자로 표현할때는 \\(역슬래시두번)
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}
