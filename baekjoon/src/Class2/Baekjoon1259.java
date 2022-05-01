package Class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Baekjoon1259 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (Integer.parseInt(str) == 0) {
                break;
            }
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(str.length() - (i + 1))) {
                    cnt++;
                }
            }
            if(cnt == str.length()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
