import java.util.Arrays;
import java.util.Scanner;

public class Gravity_Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
        Arrays.sort(heights);
        for(int height : heights){
            System.out.print(height + " ");
        }
        sc.close();
    }
}
