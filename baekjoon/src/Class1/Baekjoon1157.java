package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            arr[Character.toUpperCase(chArr[i]) - 65]++;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ){
                max = arr[i];
                result = (char) (i + 65);
            }
            else if (max == arr[i]) {
                result = '?';
            }

        }
        System.out.println(result);


    }
}
