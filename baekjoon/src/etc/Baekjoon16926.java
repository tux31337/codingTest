package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon16926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
           st= new StringTokenizer(br.readLine());
           for (int j = 0; j < y; j++) {
               arr[i][j] = Integer.parseInt(st.nextToken());
           }
        }


    }
}
