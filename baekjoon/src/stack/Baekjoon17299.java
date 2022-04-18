package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] answer = new int[N];
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] counter = count(arr);
        stack.push(0);

        for(int i = 1; i < N; i++) {
            if(stack.empty()) {
                stack.push(i);
            }

            while (!stack.empty() &&  counter[arr[stack.peek()]] < counter[arr[i]]) {
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

    static int[] count(int[] arr) {
        int[] counter = new int[1000001];
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]] = ++counter[arr[i]];
        }
        return counter;
    }
}
