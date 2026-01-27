import java.util.Scanner;

public class Anton_And_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        String results = sc.nextLine();
        long antonWins = 0;
        long danikWins = 0;
        for(int i = 0;i < results.length();i++){
            if(results.charAt(i) == 'A'){
                antonWins++;
            }
            else{
                danikWins++;
            }
        }
        if(antonWins > danikWins){
            System.out.println("Anton");
        }        
        else if(danikWins > antonWins){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        sc.close();
    }
}