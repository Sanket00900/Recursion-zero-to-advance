class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
    
    private static void findComb(int i, int target, int[]arr, ArrayList<Integer>subAns,List<List<Integer>>ans){
        if(i == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(subAns));          // imp 
            }
            return;
        }
        
        if(arr[i] <= target){         // take
            subAns.add(arr[i]);
            findComb(i,target - arr[i],arr, subAns, ans);
            subAns.remove(subAns.size() - 1);
        }
        
        findComb(i+1,target,arr,subAns,ans);   // not take
    }
}
