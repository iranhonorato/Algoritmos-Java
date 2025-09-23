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




}
