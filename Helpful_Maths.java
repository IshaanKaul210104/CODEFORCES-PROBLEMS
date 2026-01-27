import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = (s.length()+1)/2;
        int[] arr = new int[n];
        
        for(int i = 0;i < arr.length;i++){
            arr[i] = Character.getNumericValue(s.charAt(i*2));
        }
        Arrays.sort(arr);
        
        String s1 = "";
        int i = 0;
        while(i < arr.length - 1){
            s1 += String.valueOf(arr[i++]) + "+";
        }
        s1 += String.valueOf(arr[i]);
        System.out.println(s1);
        
        sc.close();
    }
}
