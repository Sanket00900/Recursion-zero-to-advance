import java.util.ArrayList;

public class NoOfSubsequencesWithSumK {
    public static void main(String[] args) {
        int[]arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> path = new ArrayList<>();
        int ans = printCountOfSubsequence(arr,0,0,k);
        System.out.println(ans);
    }
    private static int printCountOfSubsequence(int[] arr, int i, int sum, int k) {
        if (i == arr.length) {
            if(sum == k){
                return 1;
            }
            else{
                return 0;
            }
        }
        sum += arr[i];
        int l = printCountOfSubsequence(arr, i + 1, sum, k);
        sum -= arr[i];
        int  r = printCountOfSubsequence(arr, i + 1, sum, k);
        return l+r;
    }
}
