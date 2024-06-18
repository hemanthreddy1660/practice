import java.util.*;
public class largeinteger {
    public static void main(String[] args) {
        int[] arr1={1,3,2,8,9};
        int[] ans = ans(arr1);
        System.out.println(Arrays.toString(ans));

    }
    static int[] ans(int[] arr){
        for(int i=arr.length-1;i>1;i--){
            if(arr[i]==9){
                arr[i-1]=arr[i-1]+1;
                arr[i]=0;
                break;
            }else{
                arr[i]=arr[i]+1;
                break;
            }
        }return arr;
    }
}
