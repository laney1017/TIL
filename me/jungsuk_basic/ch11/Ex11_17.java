package me.jungsuk_basic.ch11;

import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        // Set entrySet() HashMap에 저장된 키와 값을 엔트리(키와 값의 결합)의 형태로 Set에 저장해서 반환하는 메서드
        Set set = map.entrySet();   // key와 value가 묶인것(entry)의 집합을 반환
        Iterator it = set.iterator();  // Iterator : 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next(); // Map인터페이스, Entry인터페이스(Map의 내부 인터페이스)
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue()); //getKey() key값반환, getValue() value값반환
        }

        // Set keySet() HashMap에 저장된 모든 키가 저장된 Set을 반환
        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        // Collection values() HashMap에 저장된 모든 값을 컬렉션의 형태로 반환
        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            int i = (int)it.next();   // Integer i = (Integer)it.nest(); 오토박싱(기본형값을 래퍼 클래스의 객체로 자동변환)
            total += i;     // total += i.intValue();  오토박싱
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/ set.size());   // 평균값을 구할때는 float로 형변환해야한다.
        System.out.println("최고점수 : " + Collections.max(values));  //Comparable 구현한 class 객체만 가능
        System.out.println("최저점수 : " + Collections.min(values));

        // 잘못작성했다가 오류발생했다
        // 점수를 String으로 입력하면
        // Exception in thread "main" java.lang.ClassCastException 클래스 형 변환(캐스팅) 연산을 잘못 했을 때 발생
        // String 객체를 Integer형으로 형변환 하려 하는 경우 발생
        // 점수를 int로 수정해서 오류해결
    }
}

//실행화면
//이름 : 안자바, 점수 : 90
//이름 : 김자바, 점수 : 100
//이름 : 강자바, 점수 : 80
//이름 : 이자바, 점수 : 100
//참가자 명단 : [안자바, 김자바, 강자바, 이자바]
//총점 : 370
//평균 : 92.5
//최고점수 : 100
//최저점수 : 80
