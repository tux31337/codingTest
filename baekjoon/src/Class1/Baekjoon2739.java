package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            sb.append(N + " * " + i + " = ").append(N * i).append('\n');
        }
        System.out.println(sb);
    }
}
