package algoritmos.classicos;

public class MergeSort {

    public void merge(int[] A, int[] B, int[] C) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < C.length) {
            if (i == A.length) {
                C[k] = B[j];
                j++;

            } else if (j == B.length) {
                C[k] = A[i];
                i ++;

            } else if (A[i] < B[j]) {
                C[k] = A[i];
                i ++;

            } else {
                C[k] = B[j];
                j ++;
            }
            k++;
        }
    }

    public void function(int[] A) {
        if (A.length <= 1) {
            return;
        }

        int meio = A.length/2;
        int[] leftA = new int[meio];
        int[] rightA = new int[A.length - meio];

        int count = 0;
        while (count < A.length) {
            if (count < meio) {
                leftA[count] = A[count];
            } else {
                rightA[count - meio] = A[count];
            }
            count ++;
        }
        function(leftA);
        function(rightA);
        merge(leftA, rightA, A);
    }

}
