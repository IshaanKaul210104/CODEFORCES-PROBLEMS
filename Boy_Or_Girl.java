import java.util.Scanner;

public class Boy_Or_Girl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] freq = new int[26];
        String name = sc.nextLine();
        for(char ch : name.toCharArray()){
            freq[ch - 'a']++;
        }
        int count = 0;
        for(int num : freq){
            if(num > 0){
                count++;
            }
        }
        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}