import java.util.Scanner;
import java.util.HashMap;
public class Football2{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int maxFreq = 0;
        String maxWins = "";
        HashMap<String, Integer> map = new HashMap<>();
        while(n-- > 0){
            String s = sc.nextLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
            if(map.get(s) > maxFreq){
                maxFreq = map.get(s);
                maxWins = s;
            }
        }
        System.out.println(maxWins);
        sc.close();
    }
}
