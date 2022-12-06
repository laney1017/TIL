package me.programmers;

public class Compare {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 != num2) {
            answer = -1;
        } else {
            answer = 1;
        }
        return answer;
    }
}

/* 아래와 같이 간단하게 풀이 가능
class Solution {
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
*/

//Programmers 숫자비교하기
//문제 설명
//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
//제한사항
//0 ≤ num1 ≤ 10,000
//0 ≤ num2 ≤ 10,000