import java.util.Scanner;

public class New_Year_And_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int t = 240 - k; // time available for solving problems
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            sum += 5 * i;
            if (sum > t) break;
            count++;
        }

        System.out.println(count);
    }
}
