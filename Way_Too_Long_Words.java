import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            String word = sc.next();
            if(word.length() <= 10){
                System.out.println(word);
            }
            else{
                System.out.println(word.charAt(0) + String.valueOf(word.length()-2) + word.charAt(word.length()-1));
            }
            n--;
        }
        sc.close();
    }
}
