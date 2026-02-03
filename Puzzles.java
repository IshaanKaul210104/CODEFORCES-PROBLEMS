import java.util.Scanner;
import java.util.Arrays;
 
public class Puzzles{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0;i < m;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minDiff = 0;
        minDiff = arr[n-1] - arr[0];
        for(int i = n;i < m;i++){
            minDiff = Math.min(minDiff, arr[i] - arr[i - n + 1]);
        }
        System.out.println(minDiff);
        sc.close();
    }
}