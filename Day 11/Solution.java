import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        // Reading the 6x6 2D array
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // Initialize max sum to the minimum possible value
        int maxHourglassSum = Integer.MIN_VALUE;

        // Loop through each hourglass in the 6x6 2D array
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                // Calculate the sum of the current hourglass
                int currentHourglassSum = 
                      arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                    + arr.get(i + 1).get(j + 1)
                    + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                // Update max hourglass sum if the current one is greater
                maxHourglassSum = Math.max(maxHourglassSum, currentHourglassSum);
            }
        }

        // Print the maximum hourglass sum
        System.out.println(maxHourglassSum);
    }
}
