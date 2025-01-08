import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); // Number of test cases

        while (t-- > 0) {
            int num = scan.nextInt();
            if (isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers <= 1 are not prime
        if (num <= 3) return true; // 2 and 3 are prime numbers
        if (num % 2 == 0 || num % 3 == 0) return false; // Exclude multiples of 2 and 3

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
