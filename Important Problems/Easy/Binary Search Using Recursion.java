
public class BinarySearch{
    public static int binarySearch(int[]arr,int target,int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end -start)/2;
        if (arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return binarySearch(arr,target,start,mid-1);

        }
        else {
            return binarySearch(arr,target,mid+1,end);
        }
    }

    public static void main(String[] args) {
        int[]arr = {2,4,6,9,12,34,56,78,90,123,456,789};
        int n = arr.length;
        int t = 9;
        int ans = binarySearch(arr,t,0,n-1);
        System.out.println(ans);
    }
}
