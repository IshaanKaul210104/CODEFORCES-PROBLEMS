import java.util.Scanner;

public class T_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        final int MAX = 1_000_000;
        boolean[] isPrime = new boolean[MAX + 1];
        for (int i = 0; i <= MAX; i++) isPrime[i] = true;
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        while (t-- > 0) {
            long num = sc.nextLong();
            long root = (long) Math.sqrt(num);
            if (root * root == num && root <= MAX && isPrime[(int) root]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}