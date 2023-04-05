package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort{
    public static <K> void merge(K[ ] S1, K[ ] S2, K[ ] S, Comparator<K> comp) {
        int i = 0, j = 0;
         while (i + j < S.length) {
             if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
             S[i+j] = S1[i++]; // copy ith element of S1 and increment i
             else
             S[i+j] = S2[j++]; // copy jth element of S2 and increment j
             }
    }
    public static <K> void mergeSort(K[ ] S, Comparator<K> comp) {
         int n = S.length;
         if (n < 2) return; // array is trivially sorted
         // divide
         int mid = n/2;
         K[ ] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
         K[ ] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
         // conquer (with recursion)
         mergeSort(S1, comp); // sort copy of first half
         mergeSort(S2, comp); // sort copy of second half
         // merge results
         merge(S1, S2, S, comp); // merge sorted halves back into original
         }
    public static void main(String[] args){
        Integer arr[]= {3, 4, 5, 6, 22, 34, 222224, 324};
        Comparator<Integer>  comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return o1;
                }
                return o2;
            }
        };
       // MergeSort<Integer> mergeSort=new MergeSort();
        MergeSort.<Integer>mergeSort(arr,comparator);
        for(Integer x:arr){
            System.out.print(x+", ");
        }
    }
}
