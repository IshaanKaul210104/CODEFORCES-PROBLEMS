import java.util.Scanner;

public class Arrival_Of_The_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = Long.MIN_VALUE, maxPos = 0, min = Long.MAX_VALUE, minPos = 0;
        for(int i = 0;i < n;i++){
            long height = sc.nextLong();
            if(height > max){
                max = height;
                maxPos = i;
            }
            if(height <= min){
                min = height;
                minPos = i;
            }
        }
        long ans = maxPos + (n - 1 - minPos);
        if(maxPos > minPos){
            ans--;
        }
        System.out.println(ans);
        sc.close();
    }
}
