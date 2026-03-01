import java.util.Scanner;

public class Cheap_Travel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Option 1: Buy all individual tickets
        int cost1 = n * a;
        
        // Option 2: Buy bundles (and individual tickets for remainder)
        int bundlesNeeded = n / m;
        int remainder = n % m;
        int cost2 = bundlesNeeded * b + remainder * a;
        
        // Option 3: Buy one extra bundle instead of individual tickets
        int cost3 = (bundlesNeeded + 1) * b;
        
        int cost = Math.min(cost1, Math.min(cost2, cost3));
        System.out.println(cost);
        sc.close();
    }
}
