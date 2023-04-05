import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Arrays;

public class Task {
    static int total = 0;  //put your task here
    static int[] queen; // slove 1
    static boolean [][]vis; // slove 2
    public static void main(String[] args) {
        int n = 8;
        queen = new int[n];
        vis=new boolean[3][n*2];
        slove2(n, 0);



    }

    static void slove(int n, int cur) {
        if (cur == n) {
            total++;
        } else {
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                queen[cur] = i;
                for (int j = 0; j < cur; j++) {
                    if (//TODO:判断是否满足规则) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {

                    slove(n, cur + 1);

                }
            }

        }
    }


    static void slove2(int n,int cur){
        if(cur==n){
            total++;
        }else {
            for (int i = 0; i <n ; i++) {
                if(!//判断是否满足要求){
                    设置数组=true;
                    slove2(n,cur+1);
                    回溯=false;

                }
            }
        }
    }

}