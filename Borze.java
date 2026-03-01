import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(index < s.length()){
            if(index + 1 == s.length()){
                if(s.charAt(index) == '.'){
                    sb.append("0");
                }
                index++;
            }
            else{
                String sub = s.substring(index, index + 2);
                if(sub.equals("-.")){
                    sb.append("1");
                    index += 2;
                }
                else if(sub.equals("--")){
                    sb.append("2");
                    index += 2;
                }
                else if(s.charAt(index) == '.'){
                    sb.append("0");
                    index += 1;
                }
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
