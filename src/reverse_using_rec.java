public class reverse_using_rec {
    static int num=0;
    static void ans(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        num=(num*10)+rem;
        ans(n/10);
    }
    static int ans1(int n){
        int digits=(int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        int rem = n%10;
        if(rem==n){
            return n;
        }
        return (int)(rem*Math.pow(10,digits-1)+helper(n/10,digits-1));
    }
    static boolean palindrome(int n){
        return n==ans1(n);
    }

    public static void main(String[] args) {
       // ans1(1245);
        System.out.println(palindrome(1));
    }
}
