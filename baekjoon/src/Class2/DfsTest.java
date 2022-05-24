package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DfsTest {
    static boolean[][] frame;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        frame = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == '0') {
                    frame[i][j] = true;
                }
            }
        }



    }


}
