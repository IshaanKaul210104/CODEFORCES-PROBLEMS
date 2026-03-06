import java.util.Scanner;

public class Multiply_By_Two_Divide_By_Six{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long num = sc.nextLong();
            int count = 0;
            boolean flag = false;
            while(num != 1){
                if(num % 3 != 0){
                    System.out.println(-1);
                    flag = true;
                    break;
                }
                else if(num % 6 == 0){
                    num /= 6;
                }
                else{
                    num *= 2;
                }
                count++;
            }
            if(!flag){
                System.out.println(count);
            }
        }
        sc.close();
    }
}
