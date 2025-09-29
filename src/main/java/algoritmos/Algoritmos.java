package algoritmos;

public class Algoritmos {

    public int binarySearch(int[] A, int elem) {
        int minIndex = 0;
        int maxIndex = A.length - 1;
        int middle = (minIndex + maxIndex)/2;

        while(minIndex <= maxIndex) {
            if(A[middle] < elem) {
                minIndex = middle + 1;
                middle = (minIndex + maxIndex)/2;
            } else if (A[middle] > elem) {
                maxIndex = middle - 1;
                middle = (minIndex + maxIndex)/2;
            } else {
                if (A[middle - 1] == elem) {
                    int[] B = new int[middle];
                    for (int i = 0; i < B.length; i++) {
                        B[i] = A[i];
                    }
                    return binarySearch(B, elem);
                }
                return middle;
            }

        }
        return -1;
    };


    public int[] bubbleSort(int[] A) {
        boolean trocar = true;
        while(trocar) {
            trocar = false;
            for(int i = 0; i <A.length-1; i++) {
                if(A[i] > A[i+1]) {
                    trocar = true;
                    int aux = A[i];
                    A[i] = A[i+1];
                    A[i+1] = aux;
                }
            }
        }
        return A;
    }


    public int[] selectionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int aux = A[j];
                    A[j] = A[i];
                    A[i] = aux;
                }
            }
        }
        return A;
    }


    public int particiona(int[] A, int left, int right) {
        int lp = left;
        int pivo = A[left];
        int count = left + 1;
        while (count < right) {
            if (A[count] < pivo) {
                lp ++;
                int aux = A[count];
                A[count] = A[lp];
                A[lp] = aux;
            }
            count ++;
        }
        int aux = A[lp];
        A[lp] = A[left];
        A[left] = aux;
        return lp;
    }

    public void quickSort(int[] A, int left, int right) {
        if (left >= right) {
            return;
        }
            int lp =  particiona(A, left, right);
            quickSort(A, left, lp);
            quickSort(A, lp + 1, right);
    }

}
