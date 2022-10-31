public class Ex3_1 {
    public static void main(String[] args) {
        int i = 5;
        i++;   // i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
        System.out.println(i);
        i = 5; // 결과를 비교하기 위해 i값을 다시 5로 변경
        ++i;
        System.out.println(i);
        // '++i;', 'i++;'처럼 증감연산자가 수식이나 메서드 호출에 포함되지 않고 독립적인 하나의 문장으로 쓰인 경우
        // 전위형과 후위형의 차이는 없다.
    }
}

// 실행화면
//6
//6