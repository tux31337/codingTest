package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int want = Integer.parseInt(br.readLine());
        int cnt = 0;
        int i = 666;
        while (true) {
            if(Integer.toString(i).contains("666")) {
                cnt++;
                if(cnt == want) {
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}
