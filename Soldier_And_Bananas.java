import java.util.Scanner;

public class Soldier_And_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int ans = k*w*(w+1)/2 - n;
        if(ans < 0) ans = 0;
        System.out.println(ans);
        sc.close();
    }
}
