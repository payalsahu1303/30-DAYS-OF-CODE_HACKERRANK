import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> gmailUsers = new ArrayList<>();
        
        String gmailPattern = "[a-z]+@gmail\\.com"; // Regular expression for Gmail accounts
        
        for (int i = 0; i < N; i++) {
            String[] userData = bufferedReader.readLine().split(" ");
            String firstName = userData[0];
            String emailID = userData[1];
            
            if (emailID.matches(gmailPattern)) {
                gmailUsers.add(firstName);
            }
        }

        bufferedReader.close();

        Collections.sort(gmailUsers); // Sort names alphabetically
        
        for (String name : gmailUsers) {
            System.out.println(name);
        }
    }
}
