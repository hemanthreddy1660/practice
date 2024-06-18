import java.util.*;
public class pairofbracketsamazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0;i<n;i++){
            list.add('(');
        }
        for(int j=n;j<2*n;j++){
            list.add(')');
        }
        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k));
        }
    }
}
