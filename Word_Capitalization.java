import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        sc.close();
    }
}
