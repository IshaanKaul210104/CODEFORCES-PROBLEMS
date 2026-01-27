import java.util.Scanner;

public class Stones_On_The_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        int count = 0;
        for(int i = 1;i < n;i++){
            if(word.charAt(i) == word.charAt(i - 1)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
