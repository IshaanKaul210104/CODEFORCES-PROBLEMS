import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            HashMap<Integer , Integer> map =new HashMap<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                map.put(a[i] , map.getOrDefault(a[i], 0) + 1);
            }
            for(Map.Entry<Integer , Integer> entry : map.entrySet()){
                sum += entry.getValue()/2;
            }
            System.out.println(sum);
            map.clear();
            
            t--;
        }
        
        sc.close();
    }
}
