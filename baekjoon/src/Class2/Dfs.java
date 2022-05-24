package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Dfs {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = sc.nextInt();
        boolean[] visited = new boolean[N + 1];

        ArrayList[] arrayList = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            String str = br.readLine();
            st = new StringTokenizer(str);
            while (st.hasMoreTokens()) {
                temp.add(Integer.parseInt(st.nextToken()));
            }
            arrayList[i] = temp;
        }
        dfs(arrayList, visited, 1);
    }

    static int[] dfs(ArrayList[] graph, boolean[] visited, int start) {
        visited[start] = true;
        System.out.println(start);

        for (int i = 0; i < graph[start].size(); i++) {
            int y = (int) graph[start].get(i);
            if (!visited[y]) dfs(graph, visited, y);
        }
        return new int[]{};
    }
}
