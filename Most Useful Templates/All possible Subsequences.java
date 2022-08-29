import java.util.ArrayList;
import java.util.List;

public class AllSubsequences {
      private static void printAllSubsequences(int i, ArrayList<Integer> ds,int[]arr){
        if(i == arr.length){
            System.out.println(ds);
            return;
        }

        // Take/Pick Condition - the particular element will be taken into subsequence
        
        ds.add(arr[i]);
        printAllSubsequences(i+1, ds,arr);
        ds.remove( ds.size()-1);
        
        //Not Pick / Take Condition - particular element won't be taken into subsequence
        
        printAllSubsequences(i+1, ds,arr);
    }
    
      public static void main(String[] args) {
        int[]arr = {3,1,2};
        ArrayList<Integer> ds = new ArrayList<>();
        printAllSubsequences(0, ds,arr);
    }
}
