import java.util.Scanner;

public class Caps_Lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(helper(str)){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < str.length();i++){
                char ch = str.charAt(i);
                if(Character.isLowerCase(ch)){
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
            System.out.println(sb.toString());
        }
        else{
            System.out.println(str);
        }
        sc.close();
    }
    public static boolean helper(String s){
        for(int i = 1;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                return false;
            }
        }
        return true;
    }
}