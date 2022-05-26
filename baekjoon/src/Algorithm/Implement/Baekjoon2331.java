package Algorithm.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(A);

        int result = -100;
        while (true) {
            int temp = arrayList.get(arrayList.size() -1);

            int value = 0;

            while (temp != 0) {
                value += Math.pow(temp % 10, P);
                temp /= 10;
            }

            if (arrayList.contains(value)) {
                result = arrayList.indexOf(value);
                break;
            }

            arrayList.add(value);
        }
        System.out.println(result);


    }
}
