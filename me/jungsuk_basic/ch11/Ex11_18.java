package me.jungsuk_basic.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// 한정된 범위 내에 있는 순차적인 값들의 빈도수는 배열을 이용하지만
// 한정되지 않은 범위의 비순차적인 값들의 빈도수는 HashMap을 이용한다.

public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

        HashMap map = new HashMap();

        // 문자열 배열에 담긴 문자열을 하나씩 읽어서 HashMap에 키로 저장하고 값으로 1을 저장한다.
        // HashMap에 같은 문자열이 키로 저장되어 있는지 containsKey()로 확인하여 이미 저장되어 있는 문자열이면 값을 1증가시킨다.
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                int value = (int) map.get(data[i]);
                map.put(data[i], value + 1); // 기존에 있는 키는 기존 값에 1을 더해서 저장
            } else {
                map.put(data[i], 1);  // 기존에 없는 키는 값을 1로 저장
            }
        }

        // Set entrySet() HashMap에 저장된 키와 값을 엔트리(키와 값의 결합)의 형태로 Set에 저장해서 반환
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++)
            bar[i] = ch;

            return new String(bar); // String(char[] chArr)
    }
}

// 실행화면
//A : ### 3
//D : ## 2
//Z : # 1
//K : ###### 6