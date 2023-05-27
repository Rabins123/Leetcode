class Solution {
    public int strStr(String haystack, String needle) {
      for(int i=0;i<haystack.length();i++){
          if(haystack.charAt(i)==needle.charAt(0)){
              boolean ans=Compare(haystack,needle,i);
              if(ans==true){
                  return i;
               }
           }
        }
        return -1;
    }

    public static boolean Compare(String s1, String s2, int idx){
         for(int i=0;i<s2.length();i++){
            if(idx>=s1.length()){
                return false;
            }
            if(s1.charAt(idx)!=s2.charAt(i)){
                return false;
            }
            idx++;
        }
        return true;
    }
}