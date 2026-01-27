import java.util.Scanner;

public class Queue_At_The_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] letters = sc.next().toCharArray();
        int index = 0;
        while(t-- > 0 && index < n - 1){
            while(index < n - 1){
                if(letters[index] == 'B' && letters[index + 1] == 'G'){
                    char temp = letters[index];
                    letters[index] = letters[index + 1];
                    letters[index + 1] = temp;
                    index += 2;
                }
                else{
                    index++;
                }
            }
            index = 0;
        }
        System.out.println(new String(letters));
        sc.close();
    }
}
