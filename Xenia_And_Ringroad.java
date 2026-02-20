import java.util.Scanner;

public class Xenia_And_Ringroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }
        int currHouse = 1;
        long time = 0;
        for(int curr : arr){
            if(curr > currHouse){
                time += curr - currHouse;
                currHouse = curr;
            }
            else if(curr < currHouse){
                time += n - currHouse + curr;
                currHouse = curr;
            }
            else{
                time += 0;
            }
        }
        System.out.println(time);
        sc.close();
    }
}
