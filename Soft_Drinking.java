import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of friends
        int k = sc.nextInt(); // number of bottles
        int l = sc.nextInt(); // volume of each bottle in ml   
        int c = sc.nextInt(); // number of limes
        int d = sc.nextInt(); // slices per lime
        int p = sc.nextInt(); // salt in grams
        int nl = sc.nextInt(); // ml needed for one person
        int np = sc.nextInt(); // grams of salt needed for one person
        int totalDrink = k * l; // total drink available
        int totalLimeSlices = c * d; // total lime slices available
        int toasts = 0;
        while(totalDrink >= nl*n && totalLimeSlices >= n && p >= np*n){
            totalDrink -= nl * n;
            totalLimeSlices -= n;
            p -= np * n;
            toasts++;
        }
        System.out.println(toasts);
        sc.close();
    }
}
