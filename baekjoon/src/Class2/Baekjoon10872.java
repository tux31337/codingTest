package Class2;

import java.util.Scanner;

public class Baekjoon10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0 || N == 1) {
            System.out.println(1);
        } else {
            int sum = 1;
            for (int i = 1; i <= N; i++) {
                sum = sum * i;
            }
            System.out.println(sum);
        }
    }
}
