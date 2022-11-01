package me.jungsuk_basic.ch10;

import java.text.DecimalFormat;

public class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");  // 문자열

            double d = num.doubleValue();
            System.out.print(d + " -> ");  // 숫자

            System.out.println(df2.format(num));  // 문자열(지수형식)
        } catch (Exception e) {}
    } // main
}
// 실행 화면
// 1,234,567.89 -> 1234567.89 -> 1.235E6
