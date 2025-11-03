package algoritmos.montanhaFrodo;



public class Mapa {
    // 0 livre
    // 1 parede
    // 2 vigiada

    private int[][] casas;

    public Mapa(String text) {
        String linhas[] = text.split("\n");
        casas = new int[linhas.length][linhas[0].length()];

        for (int i = 0; i < casas.length; i++) {
            for (int j = 0; j < casas[0].length; j++) {
                if (linhas[i].charAt(j) == '#') {
                    casas[i][j] = 1;
                } else if (linhas[i].charAt(j) == 'o') {
                    casas[i][j] = 2;
                } else {
                    casas[i][j] = 0;
                }
            }
        }
    }

    public boolean ehLivre(int i, int j) {
        return casas[i][j] != 1;
    }

    public boolean ehVigiada(int i, int j) {
        return casas[i][j] == 2;
    }

    public int getLargura() {
        return casas[0].length;
    }

    public int getAltura() {
        return casas.length;
    }

}




