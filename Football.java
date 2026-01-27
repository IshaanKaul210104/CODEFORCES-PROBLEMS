import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        boolean dangerous = false;
        for(int i = 0;i < code.length() - 6;i++){
            String segment = code.substring(i, i + 7);
            if(segment.equals("0000000") || segment.equals("1111111")){
                dangerous = true;
                break;
            }
        }
        if(dangerous == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
