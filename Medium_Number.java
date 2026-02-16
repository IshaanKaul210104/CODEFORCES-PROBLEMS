import java.util.Scanner;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            if(a != max && a != min){
                System.out.println(a);
            }
            else if(b != max && b != min){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        sc.close();
    }
}