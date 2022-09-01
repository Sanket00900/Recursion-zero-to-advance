// Problem Link : https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(), ansList);
        return ansList;
    }
    
    public void findSubsets(int ind, int [] nums, List<Integer> ds, List<List<Integer>> ans){
     ans.add(new ArrayList<>(ds));
     for(int i= ind; i < nums.length; i++){
         if(i != ind && nums[i] == nums[i-1]) continue;
         ds.add(nums[i]);
         findSubsets(i+1,nums,ds,ans);
         ds.remove(ds.size() - 1);
     }
    }
}
