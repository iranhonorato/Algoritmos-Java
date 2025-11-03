package algoritmos.classicos;

public class QuickSort {

    public void function(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int lp = left;
        int pivo = array[left];
        int count = lp + 1;
        while (count < right) {
            if (pivo > array[count]) {
                lp++;
                int aux  = array[lp];
                array[lp] = array[count];
                array[count] = aux;
            }
            count++;
        }
        int aux  = array[lp];
        array[lp] = array[left];
        array[left] = aux;

        function(array, left, lp);
        function(array,lp+1, right);
    }
}
