package me.jungsuk.ch06;

class Product {
    static int count = 0;     // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo;             // 인스턴스 고유의 번호

    {
        // Product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장한다.
        ++count;
        serialNo = count;
    }

    public Product() {}        // 기본생성자, 생략가능
}

public class Ex6_29 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}
/* Product클래스의 인스턴스를 생성할 때마다 인스턴스 블럭이 수행되어, 클래스변수 count의 값을 1증가시킨다음,
   그 값을 인스턴스변수 serialNo에 저장한다.
   모든 생성자에서 공통으로 수행되어야하는 내용이기 때문에 인스턴스 블럭을 사용하였다.
   만일, count를 인스턴스 변수로 선언했다면, 인스턴스가 생성될 때마다 0으로 초기화 될 것이므로
   모든 Product인스턴스의 serialNo값은 항상 1이 될 것이다.
 */

// 실행결과
//p1의 제품번호(serial no)는 1
//p2의 제품번호(serial no)는 2
//p3의 제품번호(serial no)는 3
//생산된 제품의 수는 모두 3개 입니다.