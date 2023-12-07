package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueue {
    public static void main(String[] args) throws InterruptedException {
        //Essa classe junta as funcionalidades de:
        //ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockQueue
        TransferQueue<Object> tq = new java.util.concurrent.LinkedTransferQueue<>();
        //Função de bloquear e  não bloquear.
        System.out.println(tq.add("Até")); //Insere um elemento à queue, se não consegue lança exceção.
        System.out.println(tq.offer("Ou não")); //Mesmo sentido, mas retorna um booleano.
        //Também pode adicionar com um tempo de espera, lançando exceção.
        tq.put("Verdade");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Verdade"); //Bloqueia a thread e espera um elemento pegar o valor posto.
            //HasWaitingConsumer verifica se alguém está esperando para consumir esse transfer.
        }
        tq.tryTransfer("Sempre"); //Retorna um boolean.
        tq.element(); //Simplesmente exibe o primeiro elemento da fila.
        tq.remove(); //Remove o primeiro elemento, retorna exceção se vazia.
        //Peek e poll tem o mesmo sentido, mas não retornam exceção.
    }
}
