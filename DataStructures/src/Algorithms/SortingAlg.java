package Algorithms;

import java.util.Arrays;

public class SortingAlg {
    public int[] sort(int[] arr){
        if(arr.length<2){
            return arr;
        }
        int[] left= Arrays.copyOfRange(arr,0,arr.length/2);
        int[] right=Arrays.copyOfRange(arr,arr.length/2,arr.length);

        int[] sortedL=sort(left);
        int[] sortedR=sort(right);
        return merge(sortedL,sortedR,arr.length);
    }

    private int[] merge(int[] sortedL, int[] sortedR, int length) {
        int[] sorted=new int[length];
        int index=0;
        int lIndex=0;
        int rIndex=0;

      for(int i:sorted){
            if(lIndex<sortedL.length && (sortedR.length<=rIndex || sortedL[lIndex]<sortedR[rIndex])){
                sorted[index]=sortedL[lIndex];
                lIndex++;
                index++;
            }
            else{
                sorted[index]=sortedR[rIndex];
                rIndex++;
                index++;
            }
        }
        return sorted;
    }

    public void printArr(int[] arr){
        for(int x:arr){
            System.out.print(x+", ");
        }
    }

}
