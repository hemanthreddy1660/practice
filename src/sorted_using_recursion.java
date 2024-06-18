public class sorted_using_recursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,10,7,7,8};
        System.out.println(linearsearch(arr,8,0));
    } static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1] && sorted(arr,index+1);
    }
    static int linearsearch(int[] arr,int target,int index){
        if(arr[index]==target){
            return index;
        }return linearsearch(arr,target,index+1);
    }

}
