import java.util.Scanner;

public class Fox_And_Snake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String fullRow = "#".repeat(m);
        String rightRow = ".".repeat(m - 1) + "#";
        String leftRow = "#" + ".".repeat(m - 1);
        for(int i = 0;i < n;i++){
            if(i%2 == 0){
                System.out.println(fullRow);
            } else if(i%2 == 1 && i%4 == 1){
                System.out.println(rightRow);
            } else {
                System.out.println(leftRow);
            }
        }
        sc.close();
    }
}