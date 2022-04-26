package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int index = 0;
        int result = 0;
        while (st.hasMoreTokens()) {
            if(index == 4) {
                result %= Math.sqrt(Integer.parseInt(st.nextToken()));
                break;
            }
            result += Math.sqrt(Integer.parseInt(st.nextToken()));
            index++;
        }
        System.out.println(result);
    }
}
