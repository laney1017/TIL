package me.jungsuk.ch09;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

//      equals메서드는 주소값으로 비교를 한다.
        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else    // 멤버변수 value의 값이 같을지라도 주소값이 다르므로 false
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1;    // 참조변수 v2는 v1이 참조하고 있는 인스턴스의 주소값을 저장한다.

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}

// 실행결과
//v1과 v2는 다릅니다.
//v1과 v2는 같습니다.