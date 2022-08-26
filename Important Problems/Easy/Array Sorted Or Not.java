
public class ArrayIsSortedOrNot{
    public static boolean isSorted(int[]arr,int startIndex){
        if(startIndex == arr.length - 1){
            return true;
        }
        if(arr[startIndex] > arr[startIndex+1]){
            return false;
        }

        boolean ans = isSorted(arr, startIndex+1);
        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {2,3,5,6,7,9};
        System.out.println(isSorted(arr,0));
    }

}
