class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        print(0 , nums,new ArrayList<>(), ans);
        return ans;
    }
    
    
    private static void print(int i, int[]arr, List<Integer> subAns, List<List<Integer>> ans){
        if( i >= arr.length){
            ans.add(new ArrayList<>(subAns));
            return;
        }
        subAns.add(arr[i]);
        print(i+1,arr,subAns,ans);       //Take   
        subAns.remove(subAns.size()-1);  
        print(i+1,arr,subAns,ans);       //Not Take
    } 
}
