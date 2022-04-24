package greed;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CodingTest1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            if(n <= 1 || result <= 1) {
                result += n;
            } else {
                result *= n;
            }
        }
        System.out.println(result);
    }
}
