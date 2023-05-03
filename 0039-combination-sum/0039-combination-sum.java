class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combin(res,new ArrayList<>(),0,candidates.length-1,target,candidates);
        return res;
    }
    public void combin(List<List<Integer>> res,List<Integer> r,int left,int right,int target,int[] candidates){
        if(r.stream().mapToInt(Integer::intValue).sum() == target){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(r);
            res.add(temp);
            
        }
        else if(r.stream().mapToInt(Integer::intValue).sum() < target){
            for(int i = left;i<=right;i++){
                if(r.stream().mapToInt(Integer::intValue).sum() + candidates[i] <= target){
                    r.add(candidates[i]);
                    combin(res,r,i,right,target,candidates);
                    r.remove(Integer.valueOf(candidates[i]));
                }
                else{
                    return;
                }
            }
        }
    }
}