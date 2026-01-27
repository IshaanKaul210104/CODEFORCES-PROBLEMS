import java.util.Scanner;

public class Alternating_Sum_Of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            int c = 1 , sum = 0;
            for(int i = 0;i < n;i++){
                int a = sc.nextInt();
                if(c%2 == 1){
                    sum += a;
                }
                else{
                    sum -= a;
                }
                c++;
            }
            System.out.println(sum);
            
            t--;
        }
        
        sc.close();
    }
}
