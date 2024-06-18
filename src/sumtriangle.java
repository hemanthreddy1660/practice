import java.util.Arrays;

public class sumtriangle {
    public static void main(String[] args) {
         int[] A = {1, 2, 3, 4, 5};
        ans(A);
    }
    public static void ans(int[] arr){
        if(arr.length<1){
            return;
        }
        int[] temp=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            temp[i]=arr[i]+arr[i+1];
        }
        ans(temp);
        System.out.println(Arrays.toString(temp));
    }
}
