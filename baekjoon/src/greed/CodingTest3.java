package greed;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CodingTest3 {
    public static void main(String[] args) throws IOException {

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        int x = 0, y = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            char type = st.nextToken().charAt(0);
            int nx = 0;
            int ny = 0;
            for(int i = 0; i < 4; i++) {
                if(type == moveTypes[i]) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }
            if(nx < 0 || ny < 0 || nx > N -1 || ny > N -1) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + 1);
        System.out.println(y + 1);




    }
}
