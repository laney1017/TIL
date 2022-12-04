package me.baekjoon;

import java.io.*;
import java.util.Stack;

public class Code9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (t-- > 0) {
            String str = br.readLine() + "\n";
            Stack<Character> s = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch == '\n' || ch == ' ') {   // 공백
                    while (!s.isEmpty()) {
                        bw.write(s.pop());  // pop:스택에서 자료를 빼는 연산
                    }
                    bw.write(ch);
                } else {
                    s.push(ch);  // push:스택에 자료를 넣는 연산
                }
            }
        }
        bw.flush();
    }
}
//Baekjoon 9093 단어 뒤집기
//문제
//문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
//출력
//각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.