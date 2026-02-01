import java.util.Arrays;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt();
            dragons[i][1] = sc.nextInt();
        }
        Arrays.sort(dragons, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            int x = dragons[i][0];
            int y = dragons[i][1];
            if (s > x) {
                s += y;
            } else {
                System.out.println("NO");
                sc.close();
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}
