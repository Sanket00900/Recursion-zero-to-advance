
import java.util.ArrayList;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        int[]arr = {3,1,2};
        ArrayList<Integer> ds = new ArrayList<>();
        printAllSubsequences(0, ds,arr);
    }

    public static void printAllSubsequences(int i, ArrayList<Integer> ds,int[]arr){
        if(i == arr.length){
            System.out.println( ds);
            return;
        }

         ds.add(arr[i]);
        printAllSubsequences(i+1, ds,arr);
         ds.remove( ds.size()-1);
        printAllSubsequences(i+1, ds,arr);
    }
}
