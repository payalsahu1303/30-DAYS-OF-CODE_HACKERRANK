import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        String b = Integer.toBinaryString(n);
        
        int maxConsecutiveOnes = 0;
        int currentCount = 0;

        for (char c : b.toCharArray()) {
            if (c == '1') {
                currentCount++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentCount);
            } else {
                currentCount = 0;
            }
        }

        System.out.println(maxConsecutiveOnes);

        bufferedReader.close();
    }
}
