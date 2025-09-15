package noRepetition;

public class NoRepetition {
    public int[] NoRepetitionFunction(int[] A,  int[] AClear) {
        int index = 0;
        for (int i = 0; i < A.length;  i++) {
            boolean found = false;
            for (int j = 0; j < AClear.length; j++) {
                if (A[i] == AClear[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                AClear[index] = A[i];
                index ++;
            }

        }
        return AClear;
    }
}
