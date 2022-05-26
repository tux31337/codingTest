package Class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        sb.append('<');
        int index = 1;
        while (!queue.isEmpty()) {
            if(queue.size() == 1) {
                sb.append(queue.poll()).append('>');
                break;
            }
            if (index == a) {
                sb.append(queue.poll()).append(", ");
                index = 1;
                continue;
            } else {
                int test = queue.poll();
                queue.add(test);
            }


            index++;
        }
        System.out.println(sb);

    }
}
