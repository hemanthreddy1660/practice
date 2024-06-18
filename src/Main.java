import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int c=2;
        int m=2;//sc.nextInt();
        int trip=m*c;
        for(int i=1;i<=n;i++){
            int groups = sc.nextInt();
            if(groups>trip){
                System.out.print("No");
                break;
            }if(i==n&&n<trip){
                System.out.print("Yes");
            }else{
                continue;
            }
        }
    }
}