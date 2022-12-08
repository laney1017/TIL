package me.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Code1158 {
    public static void main(String[] args) {
        //첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        //출력값 요세푸스 순열 < > 형태를 위해 < 삽입
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        //중간데이터 삭제 시 앞뒤 데이터의 연결을 재구성하는 LinkedList로 생성
        Queue<Integer> queue = new LinkedList<Integer>();

        //1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있다
        for (int i = 1; i <= n; i++) {
            queue.offer(i);   // 예외를 발생시키는 add가 아닌 값을 리턴하는 offer로 추가
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < k-1; j++) {
                //앞에서부터 순서대로 1,2번째 수는 pop한 후에 맨 뒤로 다시 push
                queue.offer(queue.poll()); // 예외를 발생시키는 add가 아닌 값을 리턴하는 poll로 삭제
            }
            //3번째 수 pop해서 출력할 문자열에 추가
            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}
//Baekjoon 1158
//문제
//요세푸스 문제는 다음과 같다.
//1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
//N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
//입력
//첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
//출력
//예제와 같이 요세푸스 순열을 출력한다.
