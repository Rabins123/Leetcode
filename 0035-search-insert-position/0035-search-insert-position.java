class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
       for(int i=0;i<nums.length;i++){
             if(nums[i]==target){
                 return i;
               }
               if(nums[i]>target)  {
                  return i;
                }
         }
        return n;
    }
   
}