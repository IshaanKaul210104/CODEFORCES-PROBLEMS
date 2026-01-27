import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long maxPeople = 0;
        long currentPeople = 0;
        long stations = sc.nextLong();
        for(int i = 0;i < stations;i++){
            long exited = sc.nextLong();
            long entered = sc.nextLong();
            currentPeople += entered - exited;
            maxPeople = Math.max(maxPeople, currentPeople);
        }
        System.out.println(maxPeople);
        sc.close();
    }
}
