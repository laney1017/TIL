package me.jungsuk.ch06;

class Data3 { int x; }

public class Ex6_14 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

       /* copy메서드의 반환타입이 Data3이므로 호츌결과를 저장하는 변수의 타입 역시 Data3타입의 참조변수여야 한다.
          copy메서드 내에서 생성한 객체를 main메서드에서 사용할 수 있으려면, 새로운 객체의 주소를 반환해줘야한다.
          그렇지 않으면 copy메서드가 종료되면서 새로운 객체의 참조가 사라지기 때문에 더 이상 이 객체를 사용할 방법이 없다. */
        Data3 d2 = copy(d);     // static Data3 copy(Data3 d)

        System.out.println("d.x =" + d.x);
        System.out.println("d2.x =" + d2.x);
    }

    static Data3 copy(Data3 d) {    // 새로운 객체를 생성한 다음, 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환한다.
        Data3 tmp = new Data3();      // 새로운 객체 tmp를 생성한다.
        tmp.x = d.x;                  // d.x의 값을 tmp.x에 복사한다.

        return tmp;                   // 복사한 객체의 주소를 반환한다.
    }
}
// 반환하는 값이 Data3 객체의 주소이므로 반환타입이 Data3이다
/* 1. copy메서드를 호출하면서 참조변수 d(0x100 주소)의 값이 매개변수 d(0x100 주소)에 복사된다.
   2. 새로운 객체 tmp(0x200 주소)를 생성한 다음, d.x에 저장된 값(10)을 tmp.x(0x200 주소 / 값 10)에 복사한다.
   3. copy메서드가 종료되면서 반환한 tmp의 값(0x200)은 main메서드의 참조변수 d2(0x200)에 저장된다.
   4. copy메서드가 종료되어 tmp가 사라졌지만, d2(0x200 주소)의 새로운 객체 tmp.x(0x200 주소 / 값 10)를 다룰 수 있다.
 */
// 실행결과
//8
//8