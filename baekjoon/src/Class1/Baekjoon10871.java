package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>(a);
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());
            if(value < b) {
                sb.append(value).append(" ");
            }
        }
        System.out.println(sb);




    }
}
