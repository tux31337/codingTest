package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack(N);
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    stack.push(value);
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
            }

            if (command == "push") {
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
            }

        }
    }
}

class Stack {
    private int stackArr[];
    private int top;
    Stack() {

    }

    Stack(int size) {
        this.stackArr = new int[size];
        this.top = -1;
    }

    void push(int N) {
        top++;
        stackArr[top] = N;
    }

    int pop() {
        if (top == -1) {
            return -1;
        }
        return stackArr[top--];
    }

    int size() {
        return top + 1;
    }

    int empty() {
        if (top == -1) {
            return 1;
        }
        return 0;
    }

    int top() {
        if (top == -1) {
            return -1;
        }
        return stackArr[top];
    }

}


