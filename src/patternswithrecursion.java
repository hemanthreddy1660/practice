public class patternswithrecursion {
    public static void main(String[] args) {
        pattern1(4,0);
    }
    static void pattern1(int r,int c){
        if(r==0){
            return;
        }else if(c<r){
            System.out.print("*");
            pattern1(r,c+1);
        }else{
            System.out.println();
            pattern1(r-1,0);
        }
    }
    static void pattern2(int r,int c){
        if(r==0){
            return;
        }else if(r>c){
            System.out.print("*");
            pattern1(r+1,c);
        }else{
            System.out.println();
            pattern1(0,c-1);
        }
    }
}
