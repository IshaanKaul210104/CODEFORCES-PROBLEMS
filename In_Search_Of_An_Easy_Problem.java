import java.util.Scanner;

public class In_Search_Of_An_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean isEasy = true;
        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            if(num == 1){
                isEasy = false;
            }
        }
        if(isEasy){
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }
        sc.close();
    }
}
