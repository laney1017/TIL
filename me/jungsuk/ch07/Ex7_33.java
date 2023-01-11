package me.jungsuk.ch07;

public class Ex7_33 {
    private int outerIv = 0;
    static int outerCv = 0;

    /* 인스턴스클래스 InstanceInner는 외부클래스 Ex7_33의 인스턴스멤버이기 때문에,
       인스턴스변수 outerIv와 static변수 outerCv를 모두 사용할 수 있다.
       접근제어자가 private일지라도 사용가능하다.
     */
    class InstanceInner {
        int iiv = outerIv;  // 외부 클래스의 private멤버도 접근가능하다.
        int iiv2 = outerCv;
    }

    /* 스태틱클래스 StaticInner는 외부클래스 Ex7_33의 스태틱멤버이기 때문에,
       외부클래스의 인스턴스멤버인 outerIv와 InstanceInner를 사용할 수 없다.
       static멤버인 outerCv만 사용할 수 있다.
     */
    static class StaticInner {
//   스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//        int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethoe() {
        int lv = 0;
        final int LV = 0;   // JDK1.8부터 final생략 가능

        /* 지역클래스 LocalInner는 외부클래스의 인스턴스멤버와 static멤버를 모두 사용할 수 있으며,
           지역클래스가 포함된 메서드에 정의된 지역변수도 사용할 수 있다.
           단, final이 붙은 지역변수만 접근가능한데, 그 이유는 메서드가 수행을 마쳐서 지역변수가 소멸된 시점에도, 지역클래스의 인스턴스가 소멸된 지약변수를 참조하려는 경우가 발생할 수 있기 때문이다.
           JDK1.8부터 지역클래스에 접근하는 지역변수 앞에 fianl을 생략할 수 있게 바뀌었다.(컴파일러가 자동생성)
           그러나 해당 변수의 값이 바뀌는 문장이 있으면 컴파일 에러가 발생한다.
         */
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
//         외부 클래스의 지역변수는 final이 붙은 변수 (상수)aks wjqrmsrksmdgkek.
            int liv3 = lv;      // 에러! (JDK1.8부터 에러 아님)
            int liv4 = LV;
        }
    }
}

