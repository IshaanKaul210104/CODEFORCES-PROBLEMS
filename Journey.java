import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long cycleSum = a + b + c;
            long steps = 0;

            if (n > cycleSum) {
                steps += 3 * (n / cycleSum);
                n %= cycleSum;
            }
            
            if (n > 0) {
                if (n <= a) {
                    steps++; 
                } else if (n <= a + b) {
                    steps += 2; 
                } else {
                    steps += 3; 
                }
            }

            System.out.println(steps); 
            t--;
        }

        sc.close();
    }
}
