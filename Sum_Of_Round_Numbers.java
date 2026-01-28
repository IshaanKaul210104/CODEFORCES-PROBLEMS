import java.util.Scanner;

public class Sum_Of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String numStr = String.valueOf(n);
            StringBuilder result = new StringBuilder();
            int count = 0;
            for(int i = numStr.length() - 1;i >= 0;i--){
                char digit = numStr.charAt(i);
                if(digit != '0'){
                    result.append(digit);
                    int c = count;
                    while(c-- > 0){
                        result.append('0');
                    }
                    result.append(" ");
                }
                count++;
            }
            System.out.println(result.toString().trim().split(" ").length);
            System.out.println(result.toString().trim());
        }
        sc.close();
    }
}
