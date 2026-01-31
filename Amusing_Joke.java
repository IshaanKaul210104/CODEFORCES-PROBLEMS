import java.util.Scanner;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int[] charFreq = new int[26];
        for(int i = 0;i < a.length();i++){
            charFreq[a.charAt(i) - 'A']++;
        }
        for(int i = 0;i < b.length();i++){
            charFreq[b.charAt(i) - 'A']++;
        }
        for(int i = 0;i < c.length();i++){
            charFreq[c.charAt(i) - 'A']--;
        }
        for(int freq : charFreq){
            if(freq != 0){
                System.out.println("NO");
                sc.close();
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}
