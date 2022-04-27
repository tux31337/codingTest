package Class1;

import java.util.Scanner;
public class Baekjoon2742 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }

}
