import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long diff = Math.abs(a - b);
            if(diff % 10 == 0){
                System.out.println(diff / 10);
            }
            else{
                System.out.println(diff / 10 + 1);
            }
        }
        sc.close();
    }
}
