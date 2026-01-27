import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String reversedWord = new StringBuilder(word1).reverse().toString();
        String word2 = sc.nextLine();
        if(reversedWord.equals(word2))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
