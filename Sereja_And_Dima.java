import java.util.Scanner;

public class Sereja_And_Dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0, right = n - 1;
        int serejaScore = 0, dimaScore = 0, turn = 0;
        while(left <= right){
            if(turn % 2 == 0){
                if(arr[left] >= arr[right]){
                    serejaScore += arr[left++];
                }
                else{
                    serejaScore += arr[right--];
                }
            }
            else{
                if(arr[left] >= arr[right]){
                    dimaScore += arr[left++];
                }
                else{
                    dimaScore += arr[right--];
                }
            }
            turn++;
        }
        System.out.println(serejaScore + " " + dimaScore);
        sc.close();
    }
}
