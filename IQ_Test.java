import java.util.Scanner;

public class IQ_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        if((arr[0] % 2 == 0 && arr[1] % 2 == 1 && arr[2] % 2 == 1) || 
           (arr[0] % 2 == 1 && arr[1] % 2 == 0 && arr[2] % 2 == 0)){
            System.out.println(1);
            sc.close();
            return;
        }
        if((arr[n - 1] % 2 == 0 && arr[n - 2] % 2 == 1 && arr[n - 3] % 2 == 1) ||
           (arr[n - 1] % 2 == 1 && arr[n - 2] % 2 == 0 && arr[n - 3] % 2 == 0)){
            System.out.println(n);
            sc.close();
            return;
        }
        int ans = -1;
        for(int i = 1;i < n - 1;i++){
            if((arr[i-1] % 2 == 1 && arr[i] % 2 == 0 && arr[i + 1] % 2 == 1) ||
               (arr[i-1] % 2 == 0 && arr[i] % 2 == 1 && arr[i + 1] % 2 == 0)){
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
