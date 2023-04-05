package Algorithms;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={1,5,4,7,41,32,143,1,23,43};

        SortingAlg a=new SortingAlg();
        //a.printArr(arr);
        int[] newArr=a.sort(arr);
        a.printArr(newArr);
    }
}
