import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long rows = (n%a == 0) ? n/a : n/a + 1;
        long cols = (m%a == 0) ? m/a : m/a + 1;
        System.out.println(rows*cols);
        sc.close();
    }
}