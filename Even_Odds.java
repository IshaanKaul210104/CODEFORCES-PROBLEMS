import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long odds_count = (n + 1) / 2;
        
        if(k <= odds_count){
            System.out.println(2*k - 1);
        } else {
            System.out.println(2*(k - odds_count));
        }
        sc.close();
    }
}
