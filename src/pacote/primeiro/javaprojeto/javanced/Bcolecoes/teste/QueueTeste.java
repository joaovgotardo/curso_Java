package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste {
    public static void main(String[] args) {
        //Utiliza First-In First-Out. Precisa de Comparable
        Queue<String> fila = new PriorityQueue<>();
        fila.add("G");
        fila.add("F");
        fila.add("E");
        //A PriorityQueue mantém a ordem, mas não enquanto tiver em memória. Só se houver comparator
        for (String l:fila) {
            System.out.println(l);
        }
        //Métodos .peek vai mostrar o primeiro elemento.
        //.poll vai pegar o primeiro elemento e remove.
        //.offer retorna um boolean se a capacidade da queue for ultrapassada.
        //Para estar ordenado, deve usar um desses métodos.
        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
