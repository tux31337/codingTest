package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack stack = new Stack();
        int N = Integer.parseInt(br.readLine());
        while (N > 0) {
            String str = br.readLine();
//            for(int i = 0; i < str.length(); i++) {
//                if(str.charAt(i) == ' ' || str.charAt(i) == '\n') {
//                    while (!stack.empty()) {
//                        sb.append(stack.pop());
//                    }
//                    sb.append(' ');
//                } else {
//                    stack.push(str.charAt(i));
//                }
//            }
            for (char ch: str.toCharArray()) {
                if(ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                } else {
                    stack.push(ch);
                }
            }
            while (!stack.empty()) {
                sb.append(stack.pop());
            }
            N--;
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
