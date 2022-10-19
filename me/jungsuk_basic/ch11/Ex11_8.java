package me.jungsuk_basic.ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_8 {
    public static void main(String[] args) {
        Integer[] arr = { 30, 50, 10, 40, 20};

        Arrays.sort(arr);  // Integer가 가지고 있는 기본 정렬 기준 compareTo()로 정렬
        // 정렬할 떄는 정렬기준을 매개변수로 제공하던가 아니면 위처럼 정렬 대상에 저장된 객체가 정렬 기준을 가지고 있어야 한다.
        // 그렇지 않으면 예외발생
        System.out.println(Arrays.toString(arr));

        //sort(Object[] objArr, Comparator c)
        Arrays.sort(arr, new DescComp());  // DescComp에 구현된 정렬기준 compare()로 정렬
        System.out.println(Arrays.toString(arr));
    } // main
}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Integer && o2 instanceof Integer))
            return -1; // Integer가 아니면, 비교하지 않고 -1 반환

        Integer i = (Integer) o1;
        Integer i2 = (Integer) o2;
        // return i2 - i; 또는 return i2.compareTo(i);도 가능
        return i.compareTo(i2) * -1; // 기본 정렬인 compareTo()의 역순으로 정렬
    }
}

// 실행화면
//[10, 20, 30, 40, 50]
//[50, 40, 30, 20, 10]