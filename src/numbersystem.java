import java.util.*;
public class numbersystem {
    public static void main(String[] args) {
        System.out.println(isodd(14));
    }
    static boolean isodd(int n){
        return (n&1)==0;
    }
}
