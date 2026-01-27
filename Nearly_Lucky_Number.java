import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long count = 0;
        while(num > 0){
            long digit = num % 10;
            if(digit == 4 || digit == 7){
                count++;
            }
            num /= 10;
        }
        if(isLucky(count)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
    
    public static boolean isLucky(long num){
        if(num == 0) return false;
        while(num > 0){
            long digit = num%10;
            if(digit != 4 && digit != 7){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
