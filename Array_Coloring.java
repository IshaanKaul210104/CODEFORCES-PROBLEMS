import java.util.Scanner;

public class Array_Coloring{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int oddCount = 0;
            while(n-- > 0){
                int curr = sc.nextInt();
                if(curr % 2 != 0){
                    oddCount++;
                }
            }
            if(oddCount % 2 == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
