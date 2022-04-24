package greed;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class CodingTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList= new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arrayList);

        int cnt = 0;
        int result = 0;

        for(int i = 0; i < N; i++) {
            cnt++;
            if(cnt >= arrayList.get(i)) {
                cnt = 0;
                result += 1;
            }
        }
        System.out.println(result);
    }
}
