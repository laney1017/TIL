package me.jungsuk.ch11;

import java.util.Vector;

public class Ex11_3 {
    public static void main(String[] args) {
        Vector v = new Vector(5);       // 용량(capacity)이 5인 Vector를 생성한다.
        v.add("1");
        v.add("2");
        v.add("3");     // 3개의 객체를 저장한 후 빈 곳은 null
        print(v);

        v.trimToSize();     // 빈 공간을 없앤다.(용량과 크기가 같아진다.)
//      배열은 크기를 변경할 수 없기 때문에 새로운 배열을 생성해서 그 주소값을 변수 v에 할당한다.
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6);    // capacity가 최소한 6이 되도록 한다.
//      v의 capacity가 6이상이라면 아무일도 일어나지 않지만, 3이므로 크기가 6인 배열을 생성해서 v의 내용을 복사한다.
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7);   // size가 7이 되도록 한다.
//      capacity가 충분하면 새로 인스턴스를 생성하지 않아도 되지만, 6이므로 새로운 인스턴스를 생성한다.
//      Vector는 capacity가 부족할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가된다. -> capacity 12로 생성
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();  // 모든 요소를 삭제한다.
        System.out.println("=== After clear() ===");
        print(v);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size :" + v.size());
        System.out.println("capacity :" + v.capacity());
    }
}
/* Vector의 용량(capacity)과 크기(size) */

// 실행결과
//[1, 2, 3]
//size :3
//capacity :5
//=== After trimToSize() ===
//[1, 2, 3]
//size :3
//capacity :3
//=== After ensureCapacity(6) ===
//[1, 2, 3]
//size :3
//capacity :6
//=== After setSize(7) ===
//[1, 2, 3, null, null, null, null]
//size :7
//capacity :12
//=== After clear() ===
//[]
//size :0
//capacity :12