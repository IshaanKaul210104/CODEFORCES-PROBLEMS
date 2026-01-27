import java.util.HashMap;
import java.util.Scanner;

public class Anton_And_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);
        long n = sc.nextLong();
        long totalCount = 0;
        for(int i = 0;i < n;i++){
            String polyhedron = sc.next();
            totalCount += map.get(polyhedron);
        }
        System.out.println(totalCount);
        sc.close();
    }
}
