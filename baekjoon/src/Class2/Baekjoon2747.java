package Class2;
import java.util.Scanner;
public class Baekjoon2747 {
    static int[] memo = new int[46];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = fibo(N);
        System.out.println(result);

    }

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibo(n - 1) + fibo(n - 2);
        return memo[n];
    }
}
