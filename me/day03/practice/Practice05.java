package me.day03.practice;
 /*아래의 코드는 윤년과 평년 상관없이 2월달이 28일이 나온다.
        - 윤년을 고려하여 윤년인 경우 2월달이 29일로 나오도록 수정하시오.
        - 윤년의 조건 (둘 중에서 하나만 만족하면 됨)
        1. 4의 배수이어야하고 100의 배수가 아니어야 함
        2. 400의 배수는 무조건 윤년이 됨 */

public class Practice05 {
    public static void main(String[] args) {
        int year = 2020;
        int month = 2;
        int totalDays = 0;

        switch(month) {
            // (month == 1) || (month == 3) || (month == 5) || (month == 7) ........
            // month == 부분을 switch case문에서는 생략가능 (가독성 ↑)
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                totalDays = 31;
                break;

            case 4: case 6: case 9: case 11:
                totalDays = 30;
                break;

            case 2:
                /* 1. 4의 배수이어야하고 100의 배수가 아니어야 함
                   2. 400의 배수는 무조건 윤년이 됨 */
                if (year % 4 == 0) {
                    if (year % 100 ==0) {
                        if (year % 400 ==0) {
                            totalDays = 29;
                        } else {
                            totalDays = 28;
                        }
                    } else {
                        totalDays = 29;
                    }
                } else {
                totalDays = 28; }
                break;
        }

        System.out.printf("%d년 %d월의 총 일수는 %d일 입니다\n", year, month, totalDays);
    }
}