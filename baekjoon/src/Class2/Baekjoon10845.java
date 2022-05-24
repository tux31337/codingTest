package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Queue queue = new Queue(n);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    queue.push(value);
                    break;
                case "front":
                    System.out.println(queue.front());
                    break;
                case "back":
                    System.out.println(queue.back());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.empty());
                    break;
                case "pop":
                    System.out.println(queue.pop());
                    break;
            }
        }

    }
}

class Queue {
    private int[] queueArr;
    private int front = 0;
    private int size = 0;
    private int back = 0;
    Queue() {

    }

    Queue(int n) {
        this.queueArr = new int[n];
    }

    void push(int n) {
        size++;
        queueArr[back] = n;
        back++;
    }

    int pop() {
        if (size <= 0) {
            return -1;
        }
        size--;
        return queueArr[front++];
    }

    int size() {
        return size;
    }

    int empty() {
        if (size <= 0) {
            return 1;
        }
        return 0;
    }

    int front() {
        if (size <= 0) {
            return -1;
        }
        return queueArr[front];
    }

    int back() {
        if (size <= 0) {
            return -1;
        }
        return queueArr[back - 1];
    }

}
