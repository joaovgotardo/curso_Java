package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico;

import java.util.concurrent.*;

public class ServicoLoja {
    //Um pega preço de forma síncrona, outro de forma assíncrona.
    private final ExecutorService es = Executors.newCachedThreadPool(); //Permite a criação de threads quanto necessário.

    public double precoSincrono(String loja){
        System.out.printf("Preços sendo pegos para %s (forma síncrona)", loja);
        return geradorPreco();
    }

    public Future<Double> precoAssincrono(String loja){
        System.out.printf("Preços sendo pegos para %s (forma assíncrona)%n", loja);
        return es.submit(this::geradorPreco);
    }

    public CompletableFuture<Double> precoAssincronoCompletableFuture(String loja){
        System.out.printf("Preços sendo pegos para %s (forma assíncrona)%n", loja);
        //O Completable não precisa do executor.
        return CompletableFuture.supplyAsync(this::geradorPreco);
        //Ele cria as threads com o ForkJoinPool.
    }

    private double geradorPreco(){
        System.out.printf("%n%s gerando preço%n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500);
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(1); //Simulando atraso do banco
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void shutdown(){
        es.shutdown();
    }
}
