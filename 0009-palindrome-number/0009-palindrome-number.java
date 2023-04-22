class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int reverse=0;
        while(temp!=0){
            int rem=temp%10;
            reverse=10*reverse + rem;
            temp=temp/10;
        }
        return reverse==x;
    }
}