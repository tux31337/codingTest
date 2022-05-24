package Class2;

import java.io.*;
import java.util.*;

public class Baekjoon2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<N; i++) {
            int temp = (Integer.parseInt(st.nextToken()));

            if(temp >= M) {
                continue;
            }
            else {
                list.add(temp);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        int first = 0;
        int second = 0;
        int third = 0;
        int size = list.size();
        int min = list.get(size-1);
        int min2 = list.get(size-2);

        for(int i=0; i<size; i++) {
            int sum = M;
            first = list.get(i);
            int sum1 = first;
            int sum2 = 0;
            int sum3 = 0;

            for(int j=i+1; j<size; j++) {
                second = list.get(j);
                sum2 = sum1 + second;

                if(sum2 <= (M-min)) {

                    for(int k=j+1; k<size; k++) {
                        third = list.get(k);
                        sum3 = sum2 + third;
                        if(sum3 <= M) {

                            if(sum - sum3 >= 0) {
                                result.add(sum3);
                            }
                            else {
                                sum3 = sum2;
                            }

                        }

                    }

                }

                sum2 = sum1;
            }

        }

        System.out.println(Collections.max(result));
    }
}