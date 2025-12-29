package estruturaDeDados;
import java.util.*;
import java.util.ArrayDeque;



public class Fila {
    public static void main(String[] args) {
//    Queue segue o princípio FIFO (First In, First Out) O primeiro que entra é o primeiro que sai.
//    1 - Criando a fila
        Queue<Integer> queue = new ArrayDeque<>();

//    2 - Inserido elementos na fila
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
//      Nossa queue tem a seguinte cara[1,2,3,4,5]

        while (!queue.isEmpty()) {
            System.out.println("Nossa fila atualmente: " + queue);
            System.out.printf("O primeiro elemento da nossa fila é: %d \n", queue.peek());
            int x = queue.poll();
            System.out.printf("O elemento que acabou de sair da fila é: %d \n", x);
        }
        System.out.println("Nossa fila atualmente: " + queue);
        System.out.println("\n");



//        Deque significa Double Ended Queue (Uma fila de duas pontas)
//        Diferente da Queue, um Deque permite:
//        Inserir no início ou inserir no final
//        Remover do início ou remover no final
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);

        while (!deque.isEmpty()) {
            System.out.println("Nosso deque atualmente: " + deque);
            System.out.println("O primeiro elemento do nosso deque é: " + deque.peekFirst());
            int x = deque.pollFirst();
            System.out.printf("O elemento que acabou de sair do nosso deque foi: %d \n", x);
            System.out.println("Nosso deque atualmente: " + deque);
            System.out.println("O último elemento do nosso deque é: " + deque.peekLast());
            int y = deque.pollLast();
            System.out.println("O elemento que acabou de sair do nosso deque foi: " + y);
        }
        System.out.println("Nosso deque atualmente: " + deque);


    }
}
