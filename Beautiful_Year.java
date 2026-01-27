import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        while(!isBeautiful(n)){
            n++;
        }
        System.out.println(n);
        sc.close();
    }
    public static boolean isBeautiful(int year){
        char[] digits= String.valueOf(year).toCharArray();
        if(digits[0] != digits[1] && digits[0] != digits[2] && digits[0] != digits[3] && 
            digits[1] != digits[2] && digits[1] != digits[3] && digits[2] != digits[3]
        ){
            return true;
        }
        else{
            return false;
        }
    }
}
