import java.util.Scanner;

public class Coin_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            long n = sc.nextLong();
            int coins = 1;
            if(n < 4){
                System.out.println("1");
            }
            else{
                while(n > 3){
                    n /= 4;
                    coins *= 2;
                }
                System.out.println(coins);
            }
            
            t--;
        }
        
        sc.close();
    }
}
