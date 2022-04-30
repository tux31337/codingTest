package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        char[][] arr = new char[x][y];
        int cnt = 0;

        st = new StringTokenizer(str);
        for (int i = 0; i < y; i++) {
            String s = br.readLine();
        }
    }
}
