import java.util.*;
public class minstring {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int[] arr = {7,4,8,2,9};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
      int count =1;
      if(arr.length==1){
          return 1;
      }
      for(int i=1;i<arr.length;i++){
          for(int j=0;j<i;j++){
              if(arr[j]>arr[i]){
                  count++;
              }
          }
      }return count;
    }
}


