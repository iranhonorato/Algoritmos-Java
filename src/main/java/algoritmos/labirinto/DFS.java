package algoritmos.labirinto;

import algoritmos.montanhaFrodo.Posicao;

import java.util.ArrayList;

public class DFS {

    public boolean[][] parseLabirinto(String labirinto) {
        String[] labFormat = labirinto.split("\n");
        boolean[][] booleanLab = new boolean[labFormat.length][];

        for (int i = 0; i < labFormat.length; i++) {
            String linha = labFormat[i];
            boolean[] arrayBool = new boolean[linha.length()];
            for (int j = 0; j < linha.length(); j++) {
                if (linha.charAt(j) == '#') {
                    arrayBool[j] = false;
                } else {
                    arrayBool[j] = true;
                }
            }
            booleanLab[i] = arrayBool;
        }
        return booleanLab;
    }



    public boolean encontrarSaida(String L, int i, int j, ArrayList<Posicao> caminho) {
        boolean[][] mapa = parseLabirinto(L);

        boolean[][] visitado = new boolean[mapa.length][];
        for (int k = 0; k < mapa.length; k++) {
            visitado[k] = new boolean[mapa[k].length];
        }

        caminho.clear();
        return dfs(mapa, i, j, caminho, visitado);
    }



    public boolean dfs(boolean[][] mapa, int i, int j, ArrayList<Posicao> caminho, boolean[][] visitado) {
        Posicao position = new Posicao(i, j);

        if (i < 0 || i >= mapa.length) {return true;}
        if (j < 0 || j >= mapa[i].length) {return true;}


        if (visitado[i][j]) {
            return false;
        }

        if (!mapa[i][j]) {
            return false;
        }

        visitado[i][j] = true;
        caminho.add(position);

        int up = i - 1;
        int right = j + 1;
        int down = i + 1;
        int left = j - 1;


        if (dfs(mapa, up, j, caminho, visitado)) { return true;}
        if (dfs(mapa, i, right, caminho, visitado)) {return true;}
        if (dfs(mapa, down, j, caminho, visitado)) {return true;}
        if (dfs(mapa, i, left, caminho, visitado)) {return true;}

        if (!caminho.isEmpty()) {
            Posicao last = caminho.get(caminho.size() - 1);
            if (last.i == i && last.j == j) {
                caminho.remove(caminho.size() - 1);
            }
        }

        return false;
    }

    // Exemplo de labirinto
    String lab = """
                    ##########
                    #........#
                    #..#######
                    .........#
                    ##########
                    """;
}
