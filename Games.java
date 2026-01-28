import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hostJerseys = new HashMap<>();
        HashMap<Integer, Integer> guestJerseys = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int host = sc.nextInt();
            hostJerseys.put(host, hostJerseys.getOrDefault(host, 0) + 1);
            int guest = sc.nextInt();
            guestJerseys.put(guest, guestJerseys.getOrDefault(guest, 0) + 1);
        }
        int matchingJerseys = 0;
        for(Map.Entry<Integer, Integer> entry : guestJerseys.entrySet()){
            int jerseyNumber = entry.getKey();
            if(hostJerseys.containsKey(jerseyNumber)){
                matchingJerseys += hostJerseys.get(jerseyNumber) * entry.getValue();
            }
        }
        System.out.println(matchingJerseys);
        sc.close();
    }
}
