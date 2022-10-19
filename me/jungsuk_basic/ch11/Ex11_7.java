package me.jungsuk_basic.ch11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};


        // sort(정렬대상,정렬기준)
        Arrays.sort(strArr);  // String의 Comparable구현에 의한 정렬(기본정렬기준,사전순)
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);   // 대소문자 구분안함
        // 지네릭스 public static final Comparator<String> CASE_INSENSITIVE_ORDER = new String.CaseInsensitiveComparator();
        System.out.println("strARr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());  // 역순 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {    // Comparator 구현
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경한다(양수->음수/ 0->0 / 음수->양수)
            // c1.compareTo(c2) 기본정렬기준
            // c1.compareTo(c2) * -1 은 c2.compareTo(c1)과 같다
        }
        return -1;
    }
}

// 실행화면
// strArr=[Dog, cat, lion, tiger]
// strArr=[cat, Dog, lion, tiger]
// strArr=[tiger, lion, cat, Dog]
