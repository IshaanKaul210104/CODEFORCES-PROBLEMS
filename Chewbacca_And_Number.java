import java.util.Scanner;
import java.lang.StringBuilder;
public class Chewbacca_And_Number{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        long num = sc.nextLong();
        if(num == 9){
            System.out.println(9);
            sc.close();
            return;
        }
        while(num > 0){
            long d = num % 10;
            if(d >= 5){
                d = 9 - d;
            }
            sb.append(String.valueOf(d));
            num /= 10;
        }
        String ans = sb.reverse().toString();
        if(ans.charAt(0) == '0'){
            ans = "9" + ans.substring(1);
        }
        System.out.println(Long.parseLong(ans));
        sc.close();
    }
}
