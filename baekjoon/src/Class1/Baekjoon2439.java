package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Baekjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                sb.append(" ");
            }

            for (int z = 0; z <= i; z++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
