import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] nums = new long[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextLong();
        }
        long sum = nums[0] + nums[1] + nums[2] + nums[3];
        long abc = sum / 3;
        int idx = -1;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == abc) {
                idx = i;
                break;
            }
        }
        long a = abc - nums[(idx + 1) % 4];
        long b = abc - nums[(idx + 2) % 4];
        long c = abc - nums[(idx + 3) % 4];
        System.out.println(a + " " + b + " " + c);
        sc.close();
    }
}
