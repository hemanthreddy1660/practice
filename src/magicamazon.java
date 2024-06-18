import org.w3c.dom.ls.LSOutput;

public class magicamazon {
    public static void main(String[] args) {
        int n = 757;
        int base =5;
        int ans =0;
        while(n>0){
        int last = n&1;
        ans += last*base;
        base = base*5;
        n=n>>1;
        }
        System.out.println(ans);
    }
}
