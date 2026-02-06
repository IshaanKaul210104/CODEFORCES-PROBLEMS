import java.util.Scanner;

public class Buy_A_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int cost = k * i;
            if(cost % 10 == 0 || cost % 10 == r){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
