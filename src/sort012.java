import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int c1=0;
        int c2=0;
        int c3=0;
        int[] arr = {0,2,1,1,2,2,0,1,0,2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c1++;
            }
             else if(arr[i]==1){
                c2++;
            }
            else if(arr[i]==2){
                c3++;
            }
        }
        for(int j=0;j<c1;j++){
            arr[j]=0;
        }
        for(int j=c1;j<arr.length-c3;j++){
            arr[j]=1;
        }
        for(int j=c1+c2;j<arr.length;j++){
            arr[j]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
