import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        int dolls=sc.nextInt();
        int[] arr= new int[dolls];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result =0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        System.out.println(result);
    }
}
