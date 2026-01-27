import java.util.Scanner;

public class Hard_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int leftlimit = sc.nextInt();
            int rightlimit = leftlimit;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int seatsLeft = leftlimit + rightlimit;
            int check = seatsLeft;
            
            if(a >= leftlimit){
                seatsLeft -= leftlimit;
            }
            else{
                seatsLeft = seatsLeft - a;
            }
            if(b >= rightlimit){
                seatsLeft -= rightlimit;
            }
            else{
                seatsLeft = seatsLeft - b;
            }
            seatsLeft -= c;
            if(seatsLeft <= 0){
                System.out.println(check);
            }
            else{
                System.out.println(check - seatsLeft);
            }
            
            t--;
        }
        
        sc.close();
    }
}
