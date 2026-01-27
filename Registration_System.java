import java.util.HashMap;
import java.util.Scanner;

public class Registration_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            String userName = sc.nextLine();
            if(!map.containsKey(userName)){
                System.out.println("OK");
                map.put(userName, 1);
            }
            else{
                int count = map.get(userName);
                System.out.println(userName + String.valueOf(count));
                map.put(userName, map.get(userName) + 1);
            }
        }
        sc.close();
    }
}
