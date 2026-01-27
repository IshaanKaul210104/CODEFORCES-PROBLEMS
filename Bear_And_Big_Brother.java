import java.util.Scanner;

public class Bear_And_Big_Brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limakWeight = sc.nextInt();
        int bobWeight = sc.nextInt();
        int count = 0;
        while(bobWeight >= limakWeight){
            bobWeight *= 2;
            limakWeight *= 3;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}