package binarySearch;

public class BinarySearch {
    public int BinarySeacrhFunction(int[] A, int obj) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (obj > A[mid]) {
                low = mid + 1;
            } else if (obj < A[mid]) {
                high = mid - 1;
            } else {
                if (A[mid - 1] == obj) {
                    int[] B = new int[mid];
                    for (int i = 0; i < B.length; i++) {
                        B[i] = A[i];
                    }
                    return BinarySeacrhFunction(B, obj);
                }
                return mid;
            }

        }
        return -1;
    }
}
