import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int first = Integer.parseInt(s.substring(0, 3));
            int second = Integer.parseInt(s.substring(3));
            if(digitSum(first) == digitSum(second)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
    
    public static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
