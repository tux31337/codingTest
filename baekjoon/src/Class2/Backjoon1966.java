package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Backjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int size = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            Queue<Integer> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                queue.offer(Integer.valueOf(st.nextToken()));
            }

            if (size == 1) {
                sb.append(queue.poll());
            } else {
                while (!queue.isEmpty()) {
                    int priority = -1;
                    int first = queue.peek();

                    for (int j = 0; j < queue.size(); j++) {
                        System.out.println(queue.poll());
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
