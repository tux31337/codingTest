package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            String str = br.readLine();
            int n = Integer.parseInt(str);
            arr[n % 42]++;
        }

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                num++;
            }
        }
        System.out.println(num);

    }
}
