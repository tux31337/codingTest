package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            arr[i][0] =  st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (e1, e2) -> {
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
