package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;
public class Baekjoon1920 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayList);

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(st.nextToken());
            int result = binarySearch(arrayList, target, 0, arrayList.size() - 1);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    static int binarySearch(ArrayList<Integer> array, int target, int start, int end) {
        if (start > end) {
            return 0;
            //return -1;
        }
        int mid = (start + end) / 2;

        if (array.get(mid) == target) {
            return 1;
        } else if(array.get(mid) > target) {
            end = mid - 1;
            return binarySearch(array, target, start, end);
        } else {
            start = mid + 1;
            return binarySearch(array, target, start, end);
        }
    }
}
