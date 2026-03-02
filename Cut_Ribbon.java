import java.util.Scanner;
import java.util.Arrays;

public class Cut_Ribbon{
    static int[] dp;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int ans = maxPieces(n, a, b, c);
        if (ans < 0) ans = 0;
        System.out.println(ans);
        sc.close();
    }
    public static int maxPieces(int lengthLeft, int a, int b, int c){
        if (lengthLeft < 0) {
            return Integer.MIN_VALUE; 
        }
        if (lengthLeft == 0) {
            return 0; 
        }
        if (dp[lengthLeft] != -1) {
            return dp[lengthLeft];
        }
        int best = Integer.MIN_VALUE;
        best = Math.max(best, 1 + maxPieces(lengthLeft - a, a, b, c));
        best = Math.max(best, 1 + maxPieces(lengthLeft - b, a, b, c));
        best = Math.max(best, 1 + maxPieces(lengthLeft - c, a, b, c));
        dp[lengthLeft] = best;
        return best;
    }
}
