package me.jungsuk.ch11;

import java.util.ArrayList;
import java.util.List;

public class Ex11_2 {
    public static void main(String[] args) {
        final int LIMIT = 10;       // 자르고자 하는 글자의 개수를 지정한다.
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length/LIMIT + 10);   // 크기를 약간 여유 있게 잡는다.

        /* i가 0일 때 인덱스 0부터 10까지 잘라서 list에 삽입
           10일 때 인덱스 10부터 20까지 잘라서 list에 삽입
           20일 때 인덱스 20부터 30까지 잘라서 list에 삽입
           30일 때 인덱스 30부터 40까지 잘라서 list에 삽입
           40일 떄 else해당 인덱스 40부터 끝까지 list에 삽입 */
        for (int i = 0; i < length; i+=LIMIT) {
            if (i+LIMIT < length)
                list.add(source.substring(i, i + LIMIT));
            else
                list.add(source.substring(i));
        }

        /* ArrayList는 저장순서가 유지되고 중복을 허용한다
           Object배열을 이용해서 데이터를 순차적으로 저장한다.
           Object[0], Object[1], Object[2] ...
           배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성해서
           기존의 배열에 저장된 내용을 새로운 배열로 복사한 다음에 저장된다.
           그러나 이 과정에서 처리시간이 많이 소요되기 때문에 크기를 약간 여유 있게 미리 잡았다.
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
// 실행결과
//0123456789
//abcdefghij
//ABCDEFGHIJ
//!@#$%^&*()
//ZZZ