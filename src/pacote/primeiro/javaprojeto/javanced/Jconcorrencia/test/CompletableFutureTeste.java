package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.ServicoLoja;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTeste {
    public static void main(String[] args) {
        ServicoLoja servicoLoja = new ServicoLoja();
        PrecoSinc(servicoLoja);
        PrecoAsincFuture(servicoLoja);
        PrecoAsincCompletableFuture(servicoLoja);
    }
    private static void PrecoSinc(ServicoLoja servicoLoja){
        long inicio = System.currentTimeMillis();
        System.out.println(servicoLoja.precoSincrono("1"));
        System.out.println(servicoLoja.precoSincrono("2"));
        System.out.println(servicoLoja.precoSincrono("3"));
        System.out.println(servicoLoja.precoSincrono("4"));
        long fim = System.currentTimeMillis();
        System.out.printf("Preços gerados em %ds%n", (fim-inicio)/1000);
    }

    private static void PrecoAsincFuture(ServicoLoja servicoLoja){
        long inicio = System.currentTimeMillis();
        Future<Double> df1 = servicoLoja.precoAssincrono("1");
        Future<Double> df2 =servicoLoja.precoAssincrono("2");
        Future<Double> df3 =servicoLoja.precoAssincrono("3");
        Future<Double> df4 =servicoLoja.precoAssincrono("4");
        //Criando diferentes, para existirem threads diferentes.
        try{
            System.out.println(df1.get());
            System.out.println(df2.get());
            System.out.println(df3.get());
            System.out.println(df4.get());
        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        long fim = System.currentTimeMillis();
        System.out.printf("Preços gerados em %ds para Future%n", fim-inicio);
        servicoLoja.shutdown();

        //Problemas do Future: não pode ser completado.
    }

    private static void PrecoAsincCompletableFuture(ServicoLoja servicoLoja){
        long inicio = System.currentTimeMillis();
        CompletableFuture<Double> df1 = servicoLoja.precoAssincronoCompletableFuture("1");
        CompletableFuture<Double> df2 =servicoLoja.precoAssincronoCompletableFuture("2");
        CompletableFuture<Double> df3 =servicoLoja.precoAssincronoCompletableFuture("3");
        CompletableFuture<Double> df4 =servicoLoja.precoAssincronoCompletableFuture("4");
        //CompletableFuture utiliza o join como método de chamada, que não lança exceções.
        System.out.println(df1.join());
        System.out.println(df2.join());
        System.out.println(df3.join());
        System.out.println(df4.join());
        long fim = System.currentTimeMillis();
        System.out.printf("Preços gerados em %ds para CompletableFuture", fim-inicio);
        //CompletableFuture não precisa dar Shutdown.
    }
}
