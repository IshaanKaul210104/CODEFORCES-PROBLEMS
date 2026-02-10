import java.util.Scanner;

public class Vasya_The_Hipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count1 = Math.min(a, b);
        int count2 = (Math.max(a, b) - count1) / 2;
        System.out.println(count1 + " " + count2);
        sc.close();
    }
}
