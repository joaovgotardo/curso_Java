package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.ServicoLoja;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.ServicoLojaDepreciado;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTeste3 {
    public static void main(String[] args) {
        ServicoLojaDepreciado sld = new ServicoLojaDepreciado();
        PrecoSinc(sld);
    }

    private static void PrecoSinc(ServicoLojaDepreciado servicoLoja) {
        long inicio = System.currentTimeMillis();
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");
        ExecutorService es = Executors.newFixedThreadPool(8);
        //O Completable Future aceita sobrecarga de executors, o que permite criar threads
        //diretamente nele. Pode-se ainda criar um runnable para alterar certos comportamentos.
        //Mas o shutdown será necessário.

        //Para executar assincronamente tendo apenas métodos síncronos, deve-se criar o
        // Completable Future.

        List<CompletableFuture<Double>> syncreation = lojas.stream().map(
                s -> CompletableFuture.supplyAsync( //Cria um Completable com supplier
                () -> servicoLoja.precoSincrono(s), es //Cria o supplier para o preço
        )).collect(Collectors.toList());

        List<Double> syncdouble = syncreation.stream().map(
                CompletableFuture::join). //Se for definido o executors na criação
                //do completable, ele não utiliza o ForkJoin, mas o estabelecido.
                collect(Collectors.toList());

        long fim = System.currentTimeMillis();
        System.out.println(syncdouble);
        System.out.printf("Preços gerados em %dms para CompletableFuture", fim - inicio);
        es.shutdown();
    }
}
