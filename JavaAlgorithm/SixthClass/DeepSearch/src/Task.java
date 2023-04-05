import java.util.Arrays;

public class Task {
    static  int[][] move={{1,0,-1,0},
                          {0,1,0,-1}};
    static int rowSize=8,colSize=8;
    static boolean flag=true;
    public static void main(String[] args) {

        int [][] map={
                {1, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 2, 0, 0},
                {0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 2, 2, 0, 0},
                {0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 3}};
        search(map,0,0);
    }


    static void search(int [][] map,int row,int col){
        if(row>=rowSize || col>=colSize) return;
        if(map[row][col]==3){
            for (int i = 0; i <colSize ; i++) {
                flag=false;
                System.out.println(Arrays.toString(map[i]));
            }
        }else {
            //如何搜索？
                }
            }
        }

    }


}