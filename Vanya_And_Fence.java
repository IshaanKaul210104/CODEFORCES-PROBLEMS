import java.util.Scanner;

public class Vanya_And_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long maxHeight = sc.nextLong();
        long count = 0;
        for(int i = 0;i < n;i++){
            long currHeight = sc.nextLong();
            if(currHeight > maxHeight){
                count++;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
