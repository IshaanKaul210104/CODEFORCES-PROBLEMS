import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long sum = Math.max(a + b + c, Math.max(a * b * c, Math.max(a * (b + c), (a + b) * c)));
        System.out.println(sum);
        sc.close();
    }
}
    