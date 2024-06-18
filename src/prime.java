public class prime {
    public static void main(String[] args) {
        int n =20;
        for(int i=1;i<n;i++){
            System.out.println(i + "is" +prime(i));
        }
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while(c<=Math.sqrt(n)){
            if(n%c==0){
                return false;
            }
            c++;
        }return true;
    }
}
