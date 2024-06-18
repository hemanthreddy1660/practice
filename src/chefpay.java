import java.util.*;
import java.lang.*;
import java.io.*;

class chefpay
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1;i<=test;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            String str=sc.next();
            int n = str.length();
            int[] arr = new int[n];
            for(int j=0;j<str.length();j++){
                arr[j]=str.charAt(j);
            }System.out.println(Arrays.toString(arr));
        }

    }
}
