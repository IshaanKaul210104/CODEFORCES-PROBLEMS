import java.util.Scanner;

public class Hit_The_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        long[] denominators = {100, 20, 10, 5, 1};
        for(long denom : denominators){
            count += n / denom;
            n = n % denom;
        }
        System.out.println(count);
        sc.close();
    }
}
