import java.util.Scanner;

public class HQ9_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        if(code.contains("H") || code.contains("Q") || code.contains("9")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
