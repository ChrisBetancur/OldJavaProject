import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int arr[] = {-3, -2, -1, 1, 2, 3};

        invertPositive(arr, arr.length);

        for (int val:arr) {
            System.out.println(val);
        }
    }

    public static void invertPositive(int[] arr, int n) {
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> aux2 = new Stack<>();

        for (int val : arr) {
            if (val < 0) {
                aux.push(val);
            }
            else
                aux2.push(val);
        }

        Stack<Integer> aux3 = new Stack<>();

        while (!aux.isEmpty())
            aux3.push(aux.pop());

        System.out.println(aux.toString());
        System.out.println(aux3.toString());

        for (int i = 0; i < n; i++) {
            if (!aux3.isEmpty()) {
                arr[i] = aux3.pop();
                //System.out.println(arr[i]);
            }
            else
                arr[i] = aux2.pop();
        }
    }
}
