import java.io.*;
import java.util.*;

public class peakelement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(jump(arr));
    }
    static boolean jump(int[] arr){
        int n = arr.length;
        int size = arr.length-1;
        int farthest_jump=0;
        for(int i=n-2;i>=0;i++){
            farthest_jump = arr[i]+i;
            if(farthest_jump>size){
                size = i;
            }
        }return size==0;
    }
}