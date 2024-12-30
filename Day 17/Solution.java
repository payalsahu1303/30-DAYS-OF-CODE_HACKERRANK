import java.util.*;
import java.io.*;

//Write your code here

class Calculator{
    int power(int n, int p) throws Exception {
        int power = 1;
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        for(int i = 0; i < p; i++){
            power = power * n;
        }
        return power;
    }
 
}


class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
