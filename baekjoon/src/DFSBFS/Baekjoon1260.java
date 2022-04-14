package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1260 {
    static boolean[][] graph;
    static  boolean[] visited;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = true;
        }

        dfs(start);
        System.out.println(sb);
        visited = new boolean[N + 1];
        sb.setLength(0);
        bfs(start);

    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        for (int i = 1; i <= N; i++) {
            if(graph[start][i] == true && visited[i] == false) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        sb.append(start).append(" ");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (graph[x][i] == true && visited[i] == false) {
                    visited[i] = true;
                    queue.add(i);
                    sb.append(i).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
