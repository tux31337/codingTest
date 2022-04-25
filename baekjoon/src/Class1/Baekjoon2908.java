package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int reveseA = (a % 10 * 100) + ((a / 10 % 10) * 10) + ((a/ 100 % 10) * 1);
        int reveseB = (b % 10 * 100) + ((b / 10 % 10) * 10) + ((b/ 100 % 10) * 1);

        if (reveseA > reveseB) {
            System.out.println(reveseA);
        } else {
            System.out.println(reveseB);
        }

//        int test =reverseNumber("123");
//        System.out.println(test);
    }
//    static int reverseNumber(String a) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = a.length() - 1; i >= 0; i--) {
//            sb.append(a.charAt(i));
//        }
//        System.out.println(sb);
//        return Integer.parseInt(sb.toString());
//    }
}
