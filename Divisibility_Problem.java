import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a % b == 0){
                System.out.println("0 ");
                continue;
            }
            else{
                a = b - (a % b);
                System.out.println(a + " ");
            }
        }
        sc.close();
    }
}
