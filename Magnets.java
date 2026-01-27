import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int groups = 1;
        int prev = sc.nextInt();
        for(int i = 1; i < n; i++){
            int curr = sc.nextInt();
            if(curr != prev){
                groups++;
            }
            prev = curr;
        }
        System.out.println(groups);
        sc.close();
    }
}
