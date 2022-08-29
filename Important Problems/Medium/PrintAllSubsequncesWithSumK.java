
import java.util.ArrayList;

public class PrintAllSubsequencesWithSumK {

    public static void main(String[] args) {
        int[]arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> ans = new ArrayList<>();
        print(0,arr,0,ans,k);
    }

    private static void print(int i, int[]arr, int sum, ArrayList<Integer> ans, int k){
        if(i >= arr.length){
            if(sum == k) {
                System.out.println(ans);
            }
            return;
        }

        ans.add(arr[i]);
        sum += arr[i];
        print(i+1,arr,sum,ans,k);
        sum -= arr[i];
        ans.remove(ans.size() - 1);

        print(i+1,arr,sum,ans,k);

    }
}
