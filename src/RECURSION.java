public class RECURSION {
    public static void main(String[] args) {
      fact(3);
    }
    static void fact(int n){
        if(n>1){
            return;
        }
        System.out.println(n*n-1);
        fact(n);
    }
}
