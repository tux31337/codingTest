package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if (x == 0 && y == 0 && z == 0) {
                break;
            }
            if ((Math.pow(x, 2) + Math.pow(y, 2)) == Math.pow(z, 2)) {
                sb.append("right").append('\n');
            } else if ((Math.pow(y, 2) + Math.pow(z, 2)) == Math.pow(x, 2)) {
                sb.append("right").append('\n');
            } else if ((Math.pow(x, 2) + Math.pow(z, 2)) == Math.pow(y, 2)) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}
