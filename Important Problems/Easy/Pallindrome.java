public class Pallindrome {
    public static void main(String[] args) {
        String name = "lolol";
        boolean ans = isPallindrome(name,0);
        System.out.println(ans);

    }

    private static boolean isPallindrome(String name,int i) {
        int n = name.length();
        if(i >= n/2){
            return true;
        }
        if(name.charAt(i) != name.charAt(n-i-1)){
            return false;
        }
        return isPallindrome(name,i+1);
    }
}
