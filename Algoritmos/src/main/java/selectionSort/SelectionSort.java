package selectionSort;

public class SelectionSort {
    public int[] SelectionSortFunction(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int pivot = i;
            for (int j = pivot + 1; j < A.length; j++) {
                if (A[pivot] > A[j]) {
                    int aux = A[pivot];
                    A[pivot] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;

    }
}
