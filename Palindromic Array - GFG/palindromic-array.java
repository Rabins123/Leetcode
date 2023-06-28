//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
             
            boolean flag=true;;     
                  
             for(int i=0;i<a.length; i++) {   
                 if(!isPalindrome(a[i]))  {
                     flag=false;
                     break;
                 }  
                  
             }
             if(flag==false){
                 return 0;
             }
             else{
                 return 1;
             }
                  
           }   
                  
                  public static boolean isPalindrome(int num){
                      if(num<10){
                          return true;
                      }
                      int temp=num;
                      int reverse=0;
                      while(temp!=0){
                          int rem=temp%10;
                          reverse=reverse*10+rem;
                          temp=temp/10;
                      }
                      return reverse==num;
                  }
           
}