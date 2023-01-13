package me.jungsuk.ch11;

import java.util.*;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        Collections.sort(list1);        // list1과 list2를 정렬한다.
        Collections.sort(list2);        // Collections.sort(List 1)
        print(list1, list2);

        System.out.println("list1.containsAll(list2) :" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) :" + list1.retainAll(list2));

        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size()-1; i >= 0 ; i--) {    // 변수 i를 증가시켜가면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해 나머지 요소들이 자리이동을 하기 때문에,
                                                        // 감소시켜가면서 삭제를 해야 자리이동이 발생해도 영향을 받지 않고 작업이 가능하다.
            if (list1.contains(list2.get(i)))       // list2의 각 요소에 접근하기 위해 get(int index)메서드와 for문을 사용하였다.
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("lsit2:" + list2);
        System.out.println();
    }
}
// 실행결과
//list1:[5, 4, 2, 0, 1, 3]
//lsit2:[4, 2, 0]
//
//list1:[0, 1, 2, 3, 4, 5]  <- Collections.sort(List 1)를 이용해서 정렬하였다.
//lsit2:[0, 2, 4]
//
//list1.containsAll(list2) :true <- lsit1이 list2의 모든 요소를 포함하고 있을 때만 true
//list1:[0, 1, 2, 3, 4, 5]
//lsit2:[0, 2, 4, A, B, C] <- add(Object obj)를 이용해서 새로운 객체를 저장하였다.
//
//list1:[0, 1, 2, 3, 4, 5]
//lsit2:[0, 2, 4, AA, B, C] <- set(int index, Object obj)를 이용해서 다른 객체로 변경
//
//list1.retainAll(list2) :true <- retainAll에 의해 list1에 변화가 있었으므로 true를 반환
//list1:[0, 2, 4]              <- list2와의 공통요소 이외에는 모두 삭제되었다.(변화가 있었따.)
//lsit2:[0, 2, 4, AA, B, C]
//
//list1:[0, 2, 4]
//lsit2:[AA, B, C]