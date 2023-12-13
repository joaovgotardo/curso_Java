package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTeste {
    public static void main(String[] args) throws InterruptedException {
        //A blockingQueue tem tamanho limitado, e se novas inserções forem feitas,
        //bloqueia esse valor de ser adicionado.
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Bem-vindo ");
        //peek pega o valor
        System.out.printf("%s foi adicionado por %s%n", bq.peek(),
                Thread.currentThread().getName());
        new Thread(new Remover(bq));
        //Agora o valor será removido e outro adicionado.
        bq.put("ao programa.");
        //Enquanto o valor não for liberado da queue, nada será adicionado.
        System.out.printf("%s foi adicionado por %s%n", bq.peek(),
                Thread.currentThread().getName());
    }
    static class Remover implements Runnable{
        private final BlockingQueue<String> bq;

        public Remover(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(3);
                bq.take(); //Remove o elemento
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
