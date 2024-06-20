import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(maze1("",3,3));
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

}
