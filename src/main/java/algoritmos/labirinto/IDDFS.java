package algoritmos.labirinto;

import algoritmos.montanhaFrodo.Posicao;

import java.util.ArrayList;

public class IDDFS {

    public static boolean[][] parseLabirinto(String labirinto) {
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

    public static boolean encontrarMelhorSaida(String L, int i, int j, ArrayList<Posicao> caminho) {
        boolean[][] mapa = parseLabirinto(L);

        boolean[][] visitados  = new boolean[mapa.length][];
        for (int k  = 0; k < mapa.length; k++) {
            visitados[k] = new boolean[mapa[k].length];
        }

        caminho.clear();
        return iddfs(mapa, i, j, caminho, visitados, 0,0);
    }

    public static boolean iddfs(boolean[][] mapa, int i, int j, ArrayList<Posicao> caminho, boolean[][] visitados, int profundidade, int count) {

        Posicao posicao = new Posicao(i, j);

        // Condições para estar fora do mapa
        if (i < 0 || i > mapa.length) {
            return true;
        }

        if (j < 0 || j > mapa[i].length) {
            return true;
        }


        // Visitou um caminho já visitado então é false
        if (visitados[i][j]) return false;

        // Visitou um estado proibido, como uma parede, então é false
        if (!mapa[i][j]) return false;


        // Faz iteração da profundidade para o caso de profundidade = 0
        if (profundidade == 0) {
            profundidade ++;
            count = profundidade;
            iddfs(mapa, i, j, caminho, visitados, profundidade, count);
        };

        // Faz o controle da profundidade
        if (count == 0) {
            return false;
        }

        // Põe true onde já visitou
        visitados[i][j] = true;
        caminho.add(posicao);

        int up = i - 1;
        int right = j + 1;
        int down = i + 1;
        int left = j - 1;

        if (iddfs(mapa, up, j, caminho, visitados, profundidade, count - 1)) return true;
        if (iddfs(mapa, i, right, caminho, visitados, profundidade, count - 1)) return true;
        if (iddfs(mapa, down, j, caminho, visitados, profundidade, count - 1)) return true;
        if (iddfs(mapa, i, left, caminho, visitados, profundidade, count - 1)) return true;

        if (!caminho.isEmpty()) {
            Posicao last = caminho.get(caminho.size() - 1);
            if (last.i == i && last.j == j) {
                caminho.remove(caminho.size() - 1);
            }
        }

        visitados[i][j] = false;

        profundidade ++;
        count = profundidade;
        iddfs(mapa, i, j, caminho, visitados, profundidade, count);

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
