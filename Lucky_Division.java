import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i >= 1;i--){
            if(n % i == 0 && isLucky(i)){
                System.out.println("YES");
                sc.close();
                return;
            }
        }
        System.out.println("NO");
        sc.close();
    }
    
    public static boolean isLucky(int n) {
        String s = Integer.toString(n);
        for (char c : s.toCharArray()) {
            if (c != '4' && c != '7') {
                return false;
            }
        }
        return true;
    }
}
