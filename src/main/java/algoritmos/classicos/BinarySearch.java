package algoritmos.classicos;


// Funciona apenas quando o array está ordenada
public class BinarySearch {

    public int function (int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int middle =  (left + right)/2;

        while(array[middle] != target){
            if (array[middle] < target){
                left = middle + 1;
                middle =  (left + right)/2;
            } else if (array[middle] > target){
                right = middle - 1;
                middle =  (left + right)/2;
            }
        }

        return middle;
    }



    public int recursion (int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int middle =  (left + right)/2;

        while(array[middle] != target){
            if (array[middle] < target){
                left = middle + 1;
                middle =  (left + right)/2;
            } else if (array[middle] > target) {
                right = middle - 1;
                middle = (left + right) / 2;
            } else {
                if (array[middle-1] == target){
                    int[] newArray = new int[middle-1];
                    for (int i = 0; i < newArray.length; i++){
                        newArray[i] = array[i];
                        return recursion(newArray,target);
                    }
                }
            }
        }

        return -1;
    }
}
