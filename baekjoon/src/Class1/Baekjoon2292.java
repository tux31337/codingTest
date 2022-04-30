package Class1;

import java.util.Scanner;

public class Baekjoon2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int range = 2;
        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6 * i);
                i++;
            }
            System.out.print(i);
        }
    }
}
