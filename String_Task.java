import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(!isVowel(ch)){
                sb.append(".").append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
        
        sc.close();
    }
    
    public static boolean isVowel(char ch){
        return "aeiouyYAEIOU".indexOf(ch) != -1;
    }
}
