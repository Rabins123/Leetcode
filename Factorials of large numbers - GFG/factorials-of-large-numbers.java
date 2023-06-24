//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> factorial = new ArrayList<>();
        factorial.add(1); // Initialize factorial with 1

        for (int i = 2; i <= N; i++) {
            multiply(factorial, i);
        }

        ArrayList<Integer> newFactorial = new ArrayList<>();
        int k = 0;
        while (k < factorial.size()) {
            newFactorial.add(0, factorial.get(k));
            k++;
        }
        return newFactorial;
    }

    private static void multiply(ArrayList<Integer> number, int factor) {
        int carry = 0;
        for (int i = 0; i < number.size(); i++) {
            int product = number.get(i) * factor + carry;
            number.set(i, product % 10);
            carry = product / 10;
        }

        while (carry != 0) {
            number.add(carry % 10);
            carry /= 10;
        }
    }
    
}