package me.jungsuk.ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex7_10 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 "  + time.format(today));
    }
}
// 실행결과
//오늘 날짜는 2023/01/04
//현재 시간은 01:33:45 오후