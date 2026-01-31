import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int min = Math.min(x1, Math.min(x2, x3));
        int max = Math.max(x1, Math.max(x2, x3));
        int dest = x1 + x2 + x3 - min - max;
        int moves = Math.abs(dest - x1) + Math.abs(dest - x2) + Math.abs(dest - x3);
        System.out.println(moves);
        sc.close();
    }
}