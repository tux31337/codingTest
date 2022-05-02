package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[b + 1];

        check(arr);

        for (int i = a; i < arr.length; i++) {
            if (arr[i] == false) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);

    }

    static void check(boolean[] arr) {

        for (int i = 2; i < arr.length; i++) {
            arr[0] = true;
            arr[1] = true;
            if (arr[i] == true) continue;
            for (int j = 2 * i; j < arr.length; j+=i) {
                arr[j] = true;
            }
        }
    }
}
