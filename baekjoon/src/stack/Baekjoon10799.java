package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i] == '(') {
                st.push(i);
            } else if(str[i] == ')') {
                st.pop();
                if(str[i - 1] == '(') {
                    System.out.println(st.size());
                    sum += (st.size());
                } else {
                    sum ++;
                }
            }
        }
        System.out.println(sum);
    }
}
