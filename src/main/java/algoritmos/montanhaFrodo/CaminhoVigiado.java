package algoritmos.montanhaFrodo;

import java.util.ArrayList;

public class CaminhoVigiado {

    private static final int MAX_VIGIADAS = 3;

    private static boolean verifcaPosicoes(Mapa M, int i, int j) {
        return i >= 0 && j >= 0 && i < M.getAltura() && j < M.getLargura();
    }

    public static boolean caminhoAteMontanha(Mapa M, Posicao frodo, Posicao montanha, ArrayList<Posicao> caminho) {
        // inicia tentativa com frodo no caminho; se falhar limpamos caminho antes de retornar.
        caminho.clear();
        caminho.add(frodo);
        boolean ok = caminhoAteMontanhaRecur(M, frodo, montanha, caminho, 0);
        if (!ok) {
            caminho.clear();
        }
        return ok;
    }


    public static boolean caminhoAteMontanhaRecur(Mapa M, Posicao frodo, Posicao montanha, ArrayList<Posicao> caminho, int count) {

        if (count >= MAX_VIGIADAS) {
            return false;
        }


        int result = frodo.compareTo(montanha);
        if (result == 0) {
            return true;
        }


        // Diferença de posições em y
        int dy = frodo.i - montanha.i;

        // Diferença de posição em x
        int dx = frodo.j - montanha.j;



        if (dy > 0) { // Frodo em baixo e target em cima
            int pos_y = frodo.i - 1; // Frodo sobe
            int pos_x = frodo.j;

            if (verifcaPosicoes(M, pos_y, pos_x) && M.ehLivre(pos_y, pos_x)) {
                Posicao newFrodo = new Posicao(pos_y, pos_x);

                if (!caminho.contains(newFrodo)) {
                    int newCount = M.ehVigiada(pos_y, pos_x) ? count + 1 : 0;
                    caminho.add(newFrodo);
                    if (caminhoAteMontanhaRecur(M, newFrodo, montanha, caminho, newCount)) {
                        return true;
                    }
                    // backtrack
                    caminho.remove(caminho.size() - 1);
                }
            }
        }

        if (dy < 0) { // Frodo em cima e target em baixo
            int pos_y = frodo.i + 1; // Frodo desce
            int pos_x = frodo.j;

            if (verifcaPosicoes(M, pos_y, pos_x) && M.ehLivre(pos_y, pos_x)) {
                Posicao newFrodo = new Posicao(pos_y, pos_x);

                if (!caminho.contains(newFrodo)) {
                    int newCount = M.ehVigiada(pos_y, pos_x) ? count + 1 : 0;
                    caminho.add(newFrodo);
                    if (caminhoAteMontanhaRecur(M, newFrodo, montanha, caminho, newCount)) {
                        return true;
                    }
                    // backtrack
                    caminho.remove(caminho.size() - 1);
                }
            }
        }

        if (dx > 0) { // Frodo a direita e target a esquerda
            int pos_y = frodo.i;
            int pos_x = frodo.j - 1; // Frodo vai à esquerda

            if (verifcaPosicoes(M, pos_y, pos_x) && M.ehLivre(pos_y, pos_x)) {
                Posicao newFrodo = new Posicao(pos_y, pos_x);

                if (!caminho.contains(newFrodo)) {
                    int newCount = M.ehVigiada(pos_y, pos_x) ? count + 1 : 0;
                    caminho.add(newFrodo);
                    if (caminhoAteMontanhaRecur(M, newFrodo, montanha, caminho, newCount)) {
                        return true;
                    }
                    // backtrack
                    caminho.remove(caminho.size() - 1);
                }
            }
        }

        if (dx < 0) { // Frodo a esquerda e target a direita
            int pos_y = frodo.i;
            int pos_x = frodo.j + 1; // Frodo vai à direita

            if (verifcaPosicoes(M, pos_y, pos_x) && M.ehLivre(pos_y, pos_x)) {
                Posicao newFrodo = new Posicao(pos_y, pos_x);

                if (!caminho.contains(newFrodo)) {
                    int newCount = M.ehVigiada(pos_y, pos_x) ? count + 1 : 0;
                    caminho.add(newFrodo);
                    if (caminhoAteMontanhaRecur(M, newFrodo, montanha, caminho, newCount)) {
                        return true;
                    }
                    // backtrack
                    caminho.remove(caminho.size() - 1);
                }
            }
        }

        return false;
    }
}


