package Class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon2178 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>(M);
        visited = new boolean[M + 1];

        for (int i = 0; i < M; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        dfs(V);

    }

    static void dfs(int start) {
        visited[start] = true;
        System.out.println(start);
        for (int i : graph.get(start)) {
            if (visited[i] == false) {
                dfs(i);
            }
        }
    }
}
