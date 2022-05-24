package Class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon10451 {
    public static boolean[][] graph;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 숫자
        StringTokenizer st;

        for (int i = 0; i < T; i++) { // 테스트 케이스 반복문
            int N = Integer.parseInt(br.readLine()); // 순얄의 크기
            graph = new boolean[N + 1][N + 1];
            visited = new boolean[N + 1];
            st = new StringTokenizer(br.readLine());

            for (int x = 1; x <= N; x++) {
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true;
            }

            int result = 0;
            for (int j = 1; j < visited.length; j++) {
                if (visited[j] == false) {
                    dfs(j);
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    public static void dfs(int start) {
        visited[start] = true;
        for (int i = 1; i < graph[start].length; i++) {
            if (visited[i] == false && graph[start][i] == true) {
                dfs(i);
            }
        }
    }
}
