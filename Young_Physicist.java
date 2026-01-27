import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sumX = 0, sumY = 0, sumZ = 0;
        while (n-- > 0) {
            sumX += sc.nextLong();
            sumY += sc.nextLong();
            sumZ += sc.nextLong();
        }
        if(sumX == 0 && sumY == 0 && sumZ == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}