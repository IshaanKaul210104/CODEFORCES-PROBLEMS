import java.util.Scanner;

public class Normal_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            String s = sc.next();
            s = rev(s);
            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray()){
                if(ch == 'p'){
                    sb.append('q');
                }
                else if(ch == 'q'){
                    sb.append('p');
                }
                else{
                    sb.append(ch);
                }
            }
            System.out.println(sb);
            sb.setLength(0);
            t--;
        }
        
        sc.close();
    }
    
    public static String rev(String s){
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;j--;
        }
        return new String(ch);
    }
}
