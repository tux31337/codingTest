package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int flag = 1;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    if(flag == 1) {
                        sum++;
                    } else {
                        sum += flag;
                    }
                    flag++;
                } else {
                    flag = 1;
                }
            }
            sb.append(sum).append('\n');
            sum = 0;
            flag = 1;
        }
        System.out.println(sb);
    }
}
