import java.util.Arrays;
import java.util.Scanner;

public class Vanya_And_Lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] lanterns = new int[n];
        for (int i = 0; i < n; i++) {
            lanterns[i] = sc.nextInt();
        }
        Arrays.sort(lanterns);
        double maxDistance = 0;
        for(int i = 1;i < n;i++){
            maxDistance = Math.max(maxDistance, (lanterns[i] - lanterns[i-1]) / 2.0);
        }
        maxDistance = Math.max(maxDistance, lanterns[0]);
        maxDistance = Math.max(maxDistance, l - lanterns[n-1]);
        System.out.println(maxDistance);
        sc.close();
    }
}
