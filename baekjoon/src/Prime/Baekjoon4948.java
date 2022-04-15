package Prime;

public class Baekjoon4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] primeCheckArray = new boolean[2 * 123456 + 1];
        primeCheckArray[0] = true;
        primeCheckArray[1] = true;
        calculatePrimeNumber(primeCheckArray);
        int count = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                return;
            }
            for(int i = n + 1; i <= 2 * n ; i++) {
                if(!primeCheckArray[i]) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }

    }

    static void calculatePrimeNumber(boolean[] primeCheckArray) {
        for(int i = 2; i <= Math.sqrt(primeCheckArray.length); i++) {
            if(primeCheckArray[i]) continue;
            for(int j = i * i; j < primeCheckArray.length; j+=i) {
                primeCheckArray[j] = true;
            }
        }
    }
}
