import java.util.Scanner;

public class I_Love_Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int max = num;
        int min = num;
        n--;
        int ans = 0;
        while(n-- > 0){
            num = sc.nextInt();
            if(num > max){
                max = num;
                ans++;
            }
            if(num < min){
                min = num;
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
