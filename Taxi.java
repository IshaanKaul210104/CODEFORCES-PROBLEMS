import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt(); 
            if(arr[i] == 1) count1++;
            else if(arr[i] == 2) count2++;
            else if(arr[i] == 3) count3++;
            else if(arr[i] == 4) count4++;
        }
        int taxis = count4;
        while(count3 > 0 && count1 > 0){
            count3--;
            count1--;
            taxis++;
        }
        taxis += count3;
        taxis += count2 / 2;
        taxis += count2 % 2;
        if(count2 % 2 == 1){
            count1 -= 2;
        }
        if(count1 > 0){
            taxis += count1 / 4;
            if(count1 % 4 != 0){
                taxis++;
            }
        }
        System.out.println(taxis);
        sc.close();
    }
}
