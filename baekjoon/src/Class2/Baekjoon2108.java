package Class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            sum += temp;
            arr[i] = temp;
        }

        Arrays.sort(arr);
        int mod = arr[0];
        int count = 0;
        int max = -1;
        boolean check = false;

        for(int i = 0; i < N - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = arr[i];
                check = true;
            }else if(max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }



        sb.append(Math.round(sum / N)).append('\n');
        sb.append(arr[(N - 1) / 2]).append('\n');
        sb.append(mod).append('\n');
        sb.append(arr[N - 1] - arr[0]).append('\n');
        System.out.println(sb);


    }
}
