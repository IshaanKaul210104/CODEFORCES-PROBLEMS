import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int upper = 0;
        int lower = 0;
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else{
                lower++;
            }
        }
        
        if(lower >= upper){
            s = s.toLowerCase();
        }
        else{
            s = s.toUpperCase();
        }
        
        System.out.println(s);
        
        sc.close();
    }
}
