import java.util.Scanner;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            char ch = sc.next().charAt(0);
            if("codeforces".indexOf(ch) != -1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
        //trying again
    }
}
