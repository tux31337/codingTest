package swExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Sw2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            while (st.hasMoreTokens()) {
                int value = Integer.parseInt(st.nextToken());
                if (value % 2 == 1) {
                    sum += value;
                }
            }
            sb.append("#" + (i + 1)).append(" ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
