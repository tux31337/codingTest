package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon10816 {
    static ArrayList<Integer> arrayList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        arrayList = new ArrayList<>(N);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            arrayList.add(a);
        }

        Collections.sort(arrayList);

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int result = binarySearch(Integer.parseInt(st.nextToken()), 0, arrayList.size() - 1);
            sb.append(result).append(" ");
        }
        System.out.println(sb);



    }

    static int binarySearch(int key, int low, int high) {
        int mid;
        if (low <= high) {
            mid = (low + high) / 2;
            if (key == arrayList.get(mid)) {
                int n = upCountNumber(mid);
                int n2 = downCountNumber(mid);
                return n + n2;
            } else if (key < arrayList.get(mid)) {
                return binarySearch(key, low, mid - 1);
            } else {
                return binarySearch(key, mid + 1, high);
            }
        }

        return 0;
    }

    static int upCountNumber(int mid) {
        int cnt = 1;
        for (int i = mid + 1; i < arrayList.size(); i++) {
            if (arrayList.get(mid) == arrayList.get(i)) {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }

    static int downCountNumber(int mid) {
        int cnt = 0;
        for (int i = mid - 1; i >= 0; i--) {
            if (arrayList.get(mid) == arrayList.get(i)) {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
}
