package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {

            if (check() == true) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);

            if (prev != temp) {
                if (check[temp - 97] == false) {
                    check[temp - 97] = true;
                    prev = temp;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
