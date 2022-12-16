package me.baekjoon;

import java.io.*;
import java.util.Stack;

public class Code17413 {
    static void print(BufferedWriter bw, Stack<Character> s) throws IOException {
        //스택이 비어있지 않을떄까지 계속 출력하는 함수 설정
        while (!s.isEmpty()) {
            bw.write(s.pop());
        }
    }

    public static void main(String[] args) throws IOException{
        //첫째 줄에 문자열 S가 주어진다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //문자열이 태그를 처리하고있는지 아닌지를 확인하기 위해 tag 변수 설정
        //제일 처음에는 태그인지 아닌지도 모르기 때문에 false로 설정하고 시작한다.
        boolean tag = false;
        Stack<Character> s = new Stack<>();
        for(char ch : str.toCharArray()) {
            //여는 꺾쇠'<' 의 경우는 2가지이다.
            //문자열의 시작인 경우, 단어가끝나고 꺾쇠가 나오는 경우
            //2가지 경우 모두 지금까지 입력된 문자열을 모두 출력해야한다.
            //문자열의 시작인 경우 : 빈문자열을 출력하므로 아무것도 출력하지 않는다.
            //단어가 끝나고 < 가 나오는 경우 : 앞에 나온 단어를 뒤집어서 출력해야한다. 위에서 정의한 스택이 비어있지 않을때까지 계쏙 출력하는 함수(print)를 사용한다.
            if (ch == '<') {
                print(bw, s);
                //태그가 시작되었으니 tag를 true로 정해준다.
                tag = true;
                bw.write(ch);
            } else if (ch == '>') {
                //태그가 끝났으니 tag를 false로 정해준다.
                tag = false;
                //태그안의 문자는 뒤집지 않고 그대로 출력하므로 닫는 꺾쇠 '>' 만 출력한다.
                bw.write(ch);
            } else if (tag) {
                //태그인 경우 뒤집지 않고 그대로 출력한다.
                bw.write(ch);
            } else {
                //단어뒤집기
                //공백인 경우 -> 단어가 끝났다.
                if(ch == ' ') {
                    //단어 뒤집어 출력하고
                    print(bw, s);
                    //공백 출력한다.
                    bw.write(ch);
                } else {
                    //공백이 아닌 경우 -> 단어의 일부이니까 스택에 추가한다.
                    s.push(ch);
                }
            }
        }
        //마지막으로 스택이 비어있지 않을 수 있으니 한번 출력해준다.
        print(bw, s);
        bw.write("\n");
        //flush : Buffer에 남아있는 데이터를 모두 출력한다.(Buffer비우기)
        bw.flush();
    }
}
//Baeckjoon 17413 단어뒤집기2
//시간복잡도 : O(N)
//문제
//문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
//
//먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
//
//알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
//문자열의 시작과 끝은 공백이 아니다.
//'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
//태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
//
//입력
//첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.
//
//출력
//첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.