import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int []A={1,3,5,7,2,4,6,8};
        int max=A.length;
        int mid=max/2;
        merge(A,0,mid,max);
        System.out.println(Arrays.toString(A));

    }

    static void merge(int []A,int p,int q,int r){
        /**
        * first step,merge tow array
        * p is Lower bound,r is Upper Bound, q is middle
        * eg. [1,3,5,7,2,4,6,8] -> [1,2,3,4,5,6,7,8]
        *  */
        int leftLen=q-p;
        int rightLen=r-q;
        int[] left=new int[leftLen+1];
        int[] rigth=new int[rightLen+1];

        for(int i=0;i<leftLen;i++){
            left[i]=A[p+i];
        }
        left[leftLen]=Integer.MAX_VALUE;
        for (int i = 0; i <rightLen ; i++) {
            rigth[i]=A[q+i];
        }
        int i=0,j=0;
        for (int k = p; k <r; k++) {
            if(left[i]<rigth[j]){
                A[k]=left[i];
                i++;
            }else {
                A[k] = rigth[j];
                j++;
            }
        }

    }

    static void  mergeSort(int []A,int p,int q){

//
//        mergeSort();
//        mergeSort();
//        merge();
        /**
         * A is Out of order array
         *
         * you can use merge function solve this problem
         */

    }
}