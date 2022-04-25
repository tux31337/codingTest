package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 9;

        int max = 0;
        int index = 0;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a > max) {
                max = a;
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
