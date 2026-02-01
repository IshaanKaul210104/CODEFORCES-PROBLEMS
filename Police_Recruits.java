import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentPoliceCount = 0;
        int crimesCommitted = 0;
        while(n-- > 0){
            int num = sc.nextInt();
            if(num > 0){
                currentPoliceCount += num;
            }
            else{
                if(currentPoliceCount > 0){
                    currentPoliceCount--;
                }
                else{
                    crimesCommitted++;
                }
            }
        }
        System.out.println(crimesCommitted);
        sc.close();
    }
}
