import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int count = 0;
            for(int i = 0;i < 3;i++){
                int b = sc.nextInt();
                if(b > a) count++;
            }
            System.out.println(count);   
        }
        sc.close();
    }
}
