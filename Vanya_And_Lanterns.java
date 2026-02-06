import java.util.Scanner;

public class Vanya_And_Lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] lanterns = new int[n];
        for (int i = 0; i < n; i++) {
            lanterns[i] = sc.nextInt();
        }
        int left = 1, right = l;
        while(left <= right){
            int d = (left + right) / 2;
            boolean[] canLight = new boolean[l];
            for(int lantern : lanterns){
                int start = Math.max(0, lantern - d);
                int end = Math.min(l - 1, lantern + d);
                for(int i = start; i <= end; i++){
                    canLight[i] = true;
                }
            }
            if(allLit(canLight)){
                right = d;
            }
            else{
                left = d + 1;
            }
        }
        System.out.println(left);
        sc.close();
    }
    
    public static boolean allLit(boolean[] canLight){
        for(boolean light : canLight){
            if(!light) return false;
        }
        return true;
    }
}
