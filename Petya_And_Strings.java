import java.util.Scanner;

public class Petya_And_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        x = x.toLowerCase();
        y = y.toLowerCase();
        if(x.compareTo(y) > 0){
            System.out.println(1);
        }
        else if(x.compareTo(y) < 0){
            System.out.println(-1);
        }
        else{
            System.out.println(0);
        }
        sc.close();
    }
}
