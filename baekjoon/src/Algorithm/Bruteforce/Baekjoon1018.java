package Algorithm.Bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon1018 {

    static Boolean[][] checkArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        checkArray = new Boolean[N][M];
        for (int i = 0; i < N; i++) {
            str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    checkArray[i][j] = true;
                } else {
                    checkArray[i][j] = false;
                }
            }
        }

        int x = N - 7;
        int y = M - 7;
        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                result = check(i, j);
                arrayList.add(result);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(0));
    }

    static int check(int x, int y) {
        int finalX = x + 8;
        int finalY = y+ 8;
        int count = 0;

        boolean start = checkArray[x][y];

        for (int i = x; i < finalX; i++) {
            for (int j = y; j < finalY; j++) {
                if (checkArray[i][j] != start) {
                    count++;
                }
                start = (!start);
            }
            start = (!start);
        }
        return Math.min(count, 64 - count);
    }
}
