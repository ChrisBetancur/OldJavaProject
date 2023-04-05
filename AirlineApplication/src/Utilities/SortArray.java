package Utilities;

public class SortArray {
    public static void sortDouble(double[] arr) {
        mergeSortDouble(arr, 0, arr.length - 1);
    }

    private static void mergeSortDouble(double[] arr, int low, int high) {
        if(high <= low) return;

        int mid = (low + high) / 2;

        mergeSortDouble(arr, low, mid);
        mergeSortDouble(arr, mid + 1, high);

        mergeDouble(arr, low, mid, high);
    }

    private static void mergeDouble(double[] array, int low, int mid, int high) {
        double leftArray[] = new double[mid - low + 1];
        double rightArray[] = new double[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
