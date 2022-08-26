public class FiboRecursion {
    public static void main(String[] args) {

        int ans = fibonacciNumber(10);
        System.out.println(ans);
    }
  
    private static int fibonacciNumber(int n){
        if(n <= 1){
            return n;
        }
      
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }
}
