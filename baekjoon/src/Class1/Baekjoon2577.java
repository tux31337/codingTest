package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int[] arr = new int[10];
        int multi = a * b * c;

        while (multi > 0) {
            arr[multi % 10]++;
            multi = multi / 10;
        }
        for (int j : arr) {
            sb.append(j).append('\n');
        }

        System.out.println(sb);
    }
}
