package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;
            if (arr[index] == -1) {
                arr[index] = i;
            }
        }

        for (int i: arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);

    }
}
