import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1158 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int N = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int cnt = 1;
        for(int i = 1; i < N + 1; i++) {
            queue.add(i);
        }

        while (true) {
            if(queue.isEmpty()) {
                break;
            }
            if(cnt == count) {
                cnt = 0;
                Integer remove = queue.poll();
                if(queue.size() == 0) {
                    sb.append(remove).append('>');
                } else {
                    sb.append(remove).append(", ");
                }

            } else {
                queue.add(queue.poll());
            }
            cnt++;
        }
        System.out.println(sb);

    }
}
