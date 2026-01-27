import java.util.HashSet;
import java.util.Scanner;

public class Anton_And_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> uniqueLetters = new HashSet<>();
        String input = sc.nextLine().toLowerCase();
        for(char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
                uniqueLetters.add(ch);
            }
        }
        System.out.println(uniqueLetters.size());
        sc.close();
    }
}
