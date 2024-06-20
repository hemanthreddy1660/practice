import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(mazediagonal("",3,3));
    }
    static int maze(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int left= maze(row-1,col);
        int right=maze(row,col-1);
        return left+right;
    }
    static ArrayList<String> maze1(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(maze1(p+"d",row-1,col));
        }
        if(col>1){
            list.addAll(maze1(p+"r",row,col-1));
        }
        return list;
    }
    static ArrayList<String> mazediagonal(String p,int row,int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1 && col>1) {
            list.addAll(mazediagonal(p + "diagonal"+"->", row - 1, col-1));
        }
        if (row > 1) {
            list.addAll(mazediagonal(p + "down"+"->", row - 1, col));
        }
        if (col > 1) {
            list.addAll(mazediagonal(p + "right", row, col - 1));
        }
        System.out.println(list.size());
        return list;

    }
    static ArrayList<String> mazediagonalwithrestriction(String p,boolean[][] arr,int row,int col) {
        if (row == arr.length-1 && col == arr[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(arr[row][col]==false){
           // return;
        }
        if (row < arr.length-1 && col<arr[0].length-1) {
            list.addAll(mazediagonalwithrestriction(p + "diagonal"+"->",arr, row + 1, col+1));
        }
        if (row < arr.length-1) {
            list.addAll(mazediagonalwithrestriction(p + "down"+"->",arr, row + 1, col));
        }
        if (col > 1) {
            list.addAll(mazediagonalwithrestriction(p + "right",arr, row, col + 1));
        }
        System.out.println(list.size());
        return list;

    }
}
