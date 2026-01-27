import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            arr[x - 1] = i + 1;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
