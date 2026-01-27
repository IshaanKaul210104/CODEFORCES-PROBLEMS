import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        int total = 0;
        int i = 0;
        for(i = 0; i < n; i++){
            coins[i] = sc.nextInt();
            total += coins[i];
        }
        Arrays.sort(coins);
        int currSum = 0;
        for(i = n - 1;i >= 0;i--){
            currSum += coins[i];
            total -= coins[i];
            if(currSum > total){
                System.out.println(n - i);
                break;
            }
        }
        sc.close();
    }
}
