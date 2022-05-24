package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon15829 {
//    public static void main(String[] args) throws IOException {
//        final int R = 31;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        long result = 0;
//        String str = br.readLine();
//        for (int i = 0; i < N; i++) {
//            int a = str.charAt(i) - 96;
//            result+= a * Math.pow(R, i);
//        }
//        System.out.println(result);
//    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int prime = 1234567891;
        long result = 0;
        long r = 1;

        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            int a = str.charAt(i) - 96;
            result += (a * r) % prime;
            r=  (r * 31) % prime;
        }
        System.out.println(result % prime);
    }
}
