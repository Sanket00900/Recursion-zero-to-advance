// problem link : https://practice.geeksforgeeks.org/problems/subset-sums2234/1

class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    
    void func(int i, int sum, ArrayList<Integer>arr, int N, ArrayList<Integer>sumSubset){
        if(i == N){
            sumSubset.add(sum);
            return;
        }
        
        // Pick
        func(i+1,sum+ arr.get(i),arr,N,sumSubset);
        
        // Not Pick
        func(i+1,sum,arr,N,sumSubset);
    }
}
