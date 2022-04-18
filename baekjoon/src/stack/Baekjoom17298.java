package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoom17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] answer = new int[N];

        Stack<Integer> stack = new Stack<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(0);

        for (int i = 1; i < N; i++) {
            if (stack.empty()) {
                stack.push(i);
            }
            while (!stack.empty() && arr[stack.peek()] < arr[i]) {
                answer[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            answer[stack.peek()] = -1;
            stack.pop();
        }
        for(int result: answer) {
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }

}
