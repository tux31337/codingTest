package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str= br.readLine();
            st = new StringTokenizer(str);
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            if (count % h == 0) {
                sb.append((h * 100) + (count / h)).append('\n');

            } else {
                sb.append(((count % h) * 100) + ((count / h) + 1)).append('\n');
            }
        }
        System.out.println(sb);

    }
}
