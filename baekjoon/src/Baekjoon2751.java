import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arrayList);

        for(int i : arrayList) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
