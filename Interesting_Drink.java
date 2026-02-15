import java.util.Arrays;
import java.util.Scanner;

public class Interesting_Drink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfShops = sc.nextInt();
        int[] pricesOfBottle = new int[noOfShops];
        for (int i = 0; i < noOfShops; i++) {
            pricesOfBottle[i] = sc.nextInt();
        }
        Arrays.sort(pricesOfBottle);
        int noOfDays = sc.nextInt();
        for (int i = 0; i < noOfDays; i++) {
            int budget = sc.nextInt();
            int count = upperBound(pricesOfBottle, budget);
            System.out.println(count);
        }
        sc.close();
    }

    static int upperBound(int[] a, int key) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (a[mid] <= key) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}