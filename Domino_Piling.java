import java.util.Scanner;

public class Domino_Piling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        System.out.println((m*n)/2);
        sc.close();
    }
}
