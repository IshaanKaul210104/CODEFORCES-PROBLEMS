import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n-- > 0){
            String command = sc.next();
            if(command.equals("++X") || command.equals("X++")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
