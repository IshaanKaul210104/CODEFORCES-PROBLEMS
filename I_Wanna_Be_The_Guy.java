import java.util.Scanner;

public class I_Wanna_Be_The_Guy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] passableLevel = new boolean[n+1];
        int k1 = sc.nextInt();
        for(int i = 0; i < k1; i++){
            int level = sc.nextInt();
            passableLevel[level] = true;
        }
        int k2 = sc.nextInt();
        for(int i = 0; i < k2; i++){
            int level = sc.nextInt();
            passableLevel[level] = true;
        }
        for(int i = 1;i < n+1;i++){
            if(passableLevel[i] == false){
                System.out.println("Oh, my keyboard!");
                sc.close();
                return;
            }
        }
        System.out.println("I become the guy.");
        sc.close();
    }
}
