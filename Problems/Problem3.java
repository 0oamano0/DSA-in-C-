import java.util.*;


public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, HashSet<Integer>> database = new HashMap<>();
        boolean possible = true;

        for (int i = 0; i < m; i++) {
            int id = sc.nextInt();
            int num = sc.nextInt();

            database.putIfAbsent(id, new HashSet<>());

            if (database.get(id).contains(num)) {
                possible = false;
            } else {
                database.get(id).add(num);
            }
        }

        System.out.println("Scenario: " + (possible ? "possible" : "impossible"));

        sc.close();
    }
}
