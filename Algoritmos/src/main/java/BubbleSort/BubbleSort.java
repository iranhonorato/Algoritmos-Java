package BubbleSort;

public class BubbleSort {
    public int[] BubbleSortFunction(int[] A) {
        boolean trocar = true;
        while (trocar) {
            trocar = false;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    trocar = true;
                    int aux  = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = aux;
                }
            }
        }
        return A;
    }
}
