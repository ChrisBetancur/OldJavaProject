import java.util.Arrays;

public class Task {
    static int size;
    public static void main(String[] args) {
        int []arr={5,3,6,7,29,11,4,9,35};
        size=arr.length;
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int []arr,int low,int up){
        if(low<up) {
            int mid=paratition(arr,low,up);
            sort(arr, low,mid-1);
            sort(arr, mid+1, up);
        }
    }
    static  int paratition(int[] arr,int low,int up){

选择一个基准数，让数组左边都小于基准数，右边都大于基准数，再将基准数放入合适的位置，最后返回这个位置
    }
    static void swap(int []arr,int a,int b){
                    int t=arr[a];
                    arr[a]=arr[b];
                    arr[b]=t;
        //        arr[a]=arr[a]^arr[b];
        //        arr[b]=arr[a]^arr[b];
        //        arr[a]=arr[a]^arr[b];
    }


}