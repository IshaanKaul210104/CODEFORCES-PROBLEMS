import java.util.Arrays;
import java.util.Scanner;

public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            boolean flag = false;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 1;i < n;i++){
                if(arr[i] != arr[i - 1] && Math.abs(arr[i] - arr[i - 1]) != 1){
                    flag = true;
                }
            }
            if(!flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
