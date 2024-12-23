import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Use a HashMap instead of Dictionary for better type safety and modern usage
        Map<String, Integer> dict = new HashMap<>();

        // Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            dict.put(name, phone);
        }

        // Process queries
        while (in.hasNext()) {
            String query = in.next();
            if (dict.containsKey(query)) {
                System.out.println(query + "=" + dict.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}