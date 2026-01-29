import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();   
        }
        Arrays.sort(arr);
        int currSum = 0, count = 0;
        for(int i = 0;i < n;i++){
            if(currSum + arr[i] > 4){
                count++;
                currSum = 0;
            }
            currSum += arr[i];
        }
        if(currSum > 0) count++;
        System.out.println(count);
        sc.close();
    }
}
