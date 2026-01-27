import java.util.Scanner;

public class Chat_Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int index = 0;
        String k = "hello";
        for(int i = 0;i < message.length() && index < k.length();i++){
            if(message.charAt(i) == k.charAt(index)){
                index++;
            }
        }
        if(index == k.length()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}