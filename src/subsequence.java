import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        System.out.println(num("","23"));
    } static ArrayList<String> num(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        char ch = up.charAt(0);
        System.out.println(ch);
        int digit=(int)(ch)-49;
        System.out.println(digit);
        //System.out.println(digit);
       for(int i=(digit-1)*3;i<digit*3;i++){
           char cha = (char)('a'+i);
           list.addAll(num(p+cha,up.substring(1)));
       }
       return list;
    }
}
