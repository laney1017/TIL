package me.jungsuk.ch03;

public class Ex3_22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.printf("10.0==10.0f   %b%n", 10,0 == 10,0f);    // %b : boolean형식으로 출력
//      10.0f는 오차없이 저장할 수 있는 값이라서 double로 형변환해도 그대로 10.0

        System.out.printf("0.1==0.1f     %b%n", 0.1 == 0.1f);
//      0.1f는 저장할 때 2진수로 변환하는 과정에서 오차발생

        System.out.printf("f =%19.17f%n", f);
        System.out.printf("d =%19.17f%n", d);
        System.out.printf("d2 =%19.17f%n", d2);
        /* double타입의 상수인 0.1도 저장되는 과정에서 오차가 발생하지만,
           float타입의 리터럴인 0.1f보다 적은 오차로 저장된다.
         */

        System.out.printf("d==f    %b%n", d == f);
        /* d ==(double)f
           0.10000000000000001 == (double) 0.10000000129011612
           0.10000000000000001 == 0.10000000129011612
           false
         */

        System.out.printf("d==d2   %b%n", d == d2);
        System.out.printf("d2==f   %b%n", d2 == f);
        /* float타입의 값을 double타입으로 형변환하면, 부호화 지수는 달라지지 않고 가수의 빈자리를 0으로 체운다.
           즉, float타입의 값을 정밀도가 더 높은 double타입으로 형변환했다고 해서 오차가 적어지는 것은 아니다.
         */

        System.out.printf("(float)d==f   %b%n", (float) d == f);
        /* (float)d ==f
           (float)0.10000000000000001 == 0.10000000129011612
           0.10000000129011612 == 0.10000000129011612
           true
         */

    }
}
//실행결과
//10.0==10.0f   true
//0.1==0.1f     false
//f =0.10000000149011612
//d =0.10000000000000000
//d2 =0.10000000149011612
//d==f    false
//d==d2   false
//d2==f   true
//(float)d==f   true

// float타입의 값과 double타입의 값을 비교하려면
// double타입의 값을 float타입으로 형변환한 다음에 비교해야 한다.
// 또는, 어느정도의 오차는 무시하고 두 타입의 값을 앞에서 몇 자리만 잘라서 비교할 수도 있다.