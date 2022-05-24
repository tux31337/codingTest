package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;
public class Baekjoon1260 {

    static boolean[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
        }

        dfs(V);
        System.out.println(sb);
        sb.setLength(0);

        visited = new boolean[N + 1];
        bfs(V);
        System.out.println(sb);


    }


    static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");

        for (int i = 1; i < graph[start].length; i++) {
            if (visited[i] == false && graph[start][i] == true ) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        sb.append(start).append(" ");
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int x= queue.poll();
            for (int i = 1; i < graph[start].length; i++) {
                if (graph[x][i] == true && visited[i] == false) {
                    visited[i] = true;
                    queue.add(i);
                    sb.append(i).append(" ");
                }

            }
        }
    }
}
