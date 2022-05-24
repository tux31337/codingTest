package Algorithm.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon11724 {
    static ArrayList<ArrayList<Integer>> arrayList;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수
        arrayList = new ArrayList<ArrayList<Integer>>(N + 1);
        visited = new boolean[N + 1];
        for (int i = 0; i <= N; i++) {
            arrayList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrayList.get(x).add(y);
            arrayList.get(y).add(x);

        }

        int result = 0;
        for (int i = 1; i < visited.length; i++) {
            if (visited[i] == false) {
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }

    static void dfs(int start) {
            visited[start] = true;
            for (int i = 0; i < arrayList.get(start).size(); i++) {
                if (visited[arrayList.get(start).get(i)] == false) {
                    dfs(arrayList.get(start).get(i));
                }
            }


    }


}
