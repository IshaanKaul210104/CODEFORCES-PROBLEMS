import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = input.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
        System.out.println(result);
        sc.close();
    }
}
