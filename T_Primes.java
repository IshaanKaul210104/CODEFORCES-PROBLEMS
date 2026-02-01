import java.util.Scanner;

public class T_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long num = sc.nextLong();
            boolean found = false;
            for(long i = 1;i*i <= num;i++){
                if(i*i == num){
                    if(isPrime(i)){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
    public static boolean isPrime(long n){
        if(n <= 1) return false;
        for(long i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
