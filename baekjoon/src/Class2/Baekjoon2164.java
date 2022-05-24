package Class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2164 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.size() == 1) {
                break;
            }
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
