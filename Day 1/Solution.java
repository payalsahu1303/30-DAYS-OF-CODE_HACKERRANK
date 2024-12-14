import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        // Declare variables
        int userInt;
        double userDouble;
        String userString;

        // Read inputs
        userInt = scan.nextInt(); // Read an integer
        userDouble = scan.nextDouble(); // Read a double
        scan.nextLine(); // Consume the leftover newline
        userString = scan.nextLine(); // Read the string

        // Perform operations and print results
        System.out.println(i + userInt); // Sum of integers
        System.out.printf("%.1f%n", d + userDouble); // Sum of doubles (1 decimal place)
        System.out.println(s + userString); // Concatenated string

        // Close the scanner
        scan.close();
    }
}