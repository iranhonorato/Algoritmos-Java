package algoritmos.classicos;

public class BubbleSort {

    public int[] function(int[] array) {
        boolean trocar = true;

        while (trocar) {
            trocar = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i+1] < array[i]) {
                    trocar = true;
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                }
            }
        }
        return array;
    }
}
