package greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5585 {
    public static void main(String[] args) throws IOException {
        final int MONEY = 1000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int remainMoney = MONEY - N;
        int cnt = 0;
        int num = 0;
        if(remainMoney >= 500) {
            remainMoney = remainMoney - 500;
            cnt++;
        }
        if(remainMoney >= 100) {
            num = remainMoney / 100;
            cnt += num;
            remainMoney = remainMoney - 100 * num;
        }
        if (remainMoney >= 50) {
            num = remainMoney / 50 ;
            cnt += num;
            remainMoney = remainMoney - 50 * num;
        }
        if (remainMoney >= 10) {
            num = remainMoney / 10;
            cnt += num;
            remainMoney = remainMoney - 10 * num;
        }
        if (remainMoney >= 5) {
            num = remainMoney / 5;
            cnt += num;
            remainMoney = remainMoney - 5 * num;
        }
        cnt += remainMoney;
        System.out.println(cnt);
    }
}
