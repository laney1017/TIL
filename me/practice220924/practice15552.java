package me.practice220924;
//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
//본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

import java.io.*;      // import java.io 에 해당하는 import 모두 설정
import java.util.StringTokenizer;   // import java.util.*;로도 설정 가능

public class practice15552 {
    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader 는 Scanner 와 유사하다. import.java.io.BufferedReader; 필요
//        BufferedWriter 는 System.out.println(); 와 유사하다  import.java.BufferedWriter; 필요
//        속도 측면에서 유리,많은양의 데이터처리 시 장점
//        BufferedReader 는 입력받은 데이터 가공이 필요한 경우가 많다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; //split이랑 비슷, string 토큰을 기준으로 구분, 토큰 기본값은 공백, 토큰값은 설정가능
//        split은 메모리를 더 많이 사용하므로 stringTokenizer 사용
         int t = Integer.parseInt(br.readLine()); //buffer는 string만 값으로 받으므로 int로 변환

        for (int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        bw.flush();  // buffer입력값 출력  bw.close를 할경우에는 flush뒤에 작성해야 출력 후 닫기 가능
    }
}
