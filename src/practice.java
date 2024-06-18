import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int fact =1;
        int n = in.nextInt();
        for(int i=n;i>0;i--){
            fact= fact*i;
        }
        System.out.print(fact);

    }
}
