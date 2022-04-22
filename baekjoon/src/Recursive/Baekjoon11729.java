package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11729 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');
        move(N, 1, 2, 3);
        System.out.println(sb);
    }

    static void move(int n, int start, int mid, int end) {
        if(n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }

        move(n -1, start, end, mid);

        sb.append(start + " " + end + "\n");

        move(n -1, mid, start, end);
    }
}
