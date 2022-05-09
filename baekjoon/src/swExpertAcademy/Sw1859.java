package swExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Sw1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int day = Integer.parseInt(br.readLine());
            int[] arr = new int[day];
            int idx = 0;

            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                arr[idx] = Integer.parseInt(st.nextToken());
                idx++;
            }

            int result = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                int diff = arr[j];
                int max = 0;
                for (int z = j + 1; z < arr.length; z++) {
                    if (diff < arr[z]) {
                        max = max < arr[z] - diff ? arr[z] -diff : max;
                    }
                }
                result += max;
            }
            sb.append("#"+i).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
