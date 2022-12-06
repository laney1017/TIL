package me.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Code1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫 줄에 n(1<=n<=100,000)이 주어진다.
        int n = sc.nextInt();
        // 둘쨰 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다.
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solve(a);
    }
    public static void solve(int[] a) {
        int n = a.length;   // 수열의 길이
        Stack<Integer> stack = new Stack<Integer>();
        int m = 0; // 스택에 추가되어야 하는 수 (스택에 들어간 수가 없으니 0으로 초기화)
        StringBuilder sb = new StringBuilder(); // String객체는 변경 불가능, StringBuilder는 변경 가능한 문자열
        //향상된 for문
        for(int x : a) {
            // m < A[i] : A[i]를 pop해야 하기 때문에, m부터 A[i]까지의 모든 수를 순서대로 push해야 한다. 이후 pop을 해서 A[i]를 만든다.
            if (x > m) {
                while (x > m) {
                    stack.push(++m);
                    // StringBuilder 문자열추가 append
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                // m > A[i]인 경우 : 불가능한 경우다. pop을 하면 A[i]가 아닌 다른 수가 A에 추가된다.
                if (stack.peek() != x) {   //peek : Stack의 top에 있는 item을 삭제하지않고 해당 item을 반환
                    System.out.println("NO");
                    return;
                }
                // m == A[i]인 경우 : pop을 해서 A[i]를 만들면 된다.
                stack.pop();
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }
}
//Baekjoon 1874 스택 수열
//문제
//스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
//1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
//입력
//첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.
//출력
//입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.