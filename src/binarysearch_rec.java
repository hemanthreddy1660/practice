public class binarysearch_rec {
    public static void main(String[] args) {
      int[] arr = {1,2,4,5,9,23,24,3546};
      int target = 241;
        System.out.println(binary(arr,target,0,arr.length-1));
    }
    static int binary(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid= start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return binary(arr,target,mid+1,end);
        }else{
            return binary(arr,target,start,mid-1);
        }
    }
}
