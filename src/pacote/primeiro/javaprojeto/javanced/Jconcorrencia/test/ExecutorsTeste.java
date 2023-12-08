package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Impressor implements Runnable{
    private final int a;

    public Impressor(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        System.out.printf("%s iniciou %d%n", Thread.currentThread().getName(), a);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s terminou%n", Thread.currentThread().getName());
    }
}
public class ExecutorsTeste {
    public static void main(String[] args) {
        //A função do Executors é desacoplar a submissão de tarefas à execução, como uma API.

        //Ele tem diversos métodos para criação de um pool de threads, que não serão mais
        //objetos a partir de sua utilização.
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //O newSingleThread faria todas as tarefas se fosse usado.
        //Já o newCachedThreadPool criará quantas forem necessárias, mas reutiliza quando disponíveis.
        executorService.execute(new Impressor(1));
        executorService.execute(new Impressor(2));
        executorService.execute(new Impressor(3));
        executorService.execute(new Impressor(4));
        executorService.execute(new Impressor(5));
        executorService.execute(new Impressor(6));
        executorService.execute(new Impressor(7));
        //A execução desses 7 comandos será feito por 4 threads, e não por
        // 7 threads. O start agora é da responsabilidade do executor.
        executorService.shutdown(); //Termina o executor.

    }
}
