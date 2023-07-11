//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
       
        
      int sum = 0;
    int n = str.length() - 1;
    int i = 0;
    
    while (i <= n) {
        char current = str.charAt(i);
        char next = (i < n) ? str.charAt(i + 1) : '\0'; // '\0' represents the null character
        
        if ((current == 'I' && (next == 'V' || next == 'X')) ||
            (current == 'X' && (next == 'L' || next == 'C')) ||
            (current == 'C' && (next == 'D' || next == 'M'))) {
            sum = sum - getDecimalValue(current);
        } else {
            sum = sum + getDecimalValue(current);
        }
        
        i++; // Increment i
    }
    
    return sum;
}

private int getDecimalValue(char c) {
    // Return the decimal value for the Roman numeral character
    switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0; // Return 0 for invalid characters
    }
}
}