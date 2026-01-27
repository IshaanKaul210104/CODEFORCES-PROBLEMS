import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String letters = sc.nextLine().toLowerCase();
        int[] freq = new int[26];
        for(int i = 0;i < n;i++){
            if(Character.isLetter(letters.charAt(i))){
                freq[letters.charAt(i) - 'a']++;
            }
        }
        for(int ch : freq){
            if(ch == 0){
                System.out.println("NO");
                sc.close();
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}
