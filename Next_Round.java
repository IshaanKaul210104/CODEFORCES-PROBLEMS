import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int cutoff = -1;
        
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
            if(k == 1){
                cutoff = arr[i];
            }
            k--;
        }
        
        int count = 0;
        for(int i : arr){
            if(i >= cutoff && i > 0){
                count++;
            }   
        }
        
        System.out.println(count);
        sc.close();
    }
}
