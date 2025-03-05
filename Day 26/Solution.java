import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read actual return date
        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();
        
        // Read expected return date
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();
        
        scanner.close();
        
        int fine = 0;
        
        if (returnedYear > dueYear) {
            // If returned in a later year, fixed fine
            fine = 10000;
        } else if (returnedYear == dueYear) {
            if (returnedMonth > dueMonth) {
                // If returned in a later month but same year, fine per month
                fine = 500 * (returnedMonth - dueMonth);
            } else if (returnedMonth == dueMonth && returnedDay > dueDay) {
                // If returned after the due day but within the same month, fine per day
                fine = 15 * (returnedDay - dueDay);
            }
        }
        
        System.out.println(fine);
    }
}
