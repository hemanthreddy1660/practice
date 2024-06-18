import java.util.*;
import java.lang.*;
import java.io.*;

class petstorecodechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //Arrays.sort(arr);
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(arr[i]);
            }
//            for(int i=0;i<set.size();i++){
//                System.out.println();
//            }
           // System.out.println(set);
            if(set.size()%2==0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
