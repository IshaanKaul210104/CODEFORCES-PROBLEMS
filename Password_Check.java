import java.util.Scanner;

public class Password_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        boolean len = false;
        boolean large = false;
        boolean small = false;
        boolean digit = false;
        
        if(s.length() >= 5){
            len = true;
        }
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                digit = true;
            }
            else if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    large = true;
                }
                else{
                    small = true;
                }
            }
        }
        
        if(len == false || digit == false || large == false || small == false){
            System.out.println("Too weak");
        }
        else{
            System.out.println("Correct");
        }
        
        sc.close();
    }
}
