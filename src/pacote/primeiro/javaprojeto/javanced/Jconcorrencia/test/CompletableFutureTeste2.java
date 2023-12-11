package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio.Desconto;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio.Orcamento;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.ServicoLoja;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTeste2 {
    public static void main(String[] args) {
        ServicoLoja sl = new ServicoLoja();
        PrecoAsincCompletableFuture(sl);

    }

    private static void PrecoAsincCompletableFuture(ServicoLoja servicoLoja) {
        long inicio = System.currentTimeMillis();
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");
        //Se for feito um único list, isso acontecerá de forma síncrona, devido às operações
        //intermediárias do stream, que são síncronas.

//        List<Double> collect = lojas.stream()
//                .map(servicoLoja::precoAssincronoCompletableFuture)
//                .map(CompletableFuture::join) //Vai trazer o valor do objeto.
//                .collect(Collectors.toList());

        //Primeiro Map - É preciso que seja uma lista ao invés de uma stream diretamente.
        List<CompletableFuture<Double>> completableFutureStream = lojas.
                stream().map(servicoLoja::precoAssincronoCompletableFuture)
                .collect(Collectors.toList());

        //Segundo Map
        List<Double> collect = completableFutureStream.stream().
                map(CompletableFuture::join).collect(Collectors.toList());

        long fim = System.currentTimeMillis();
        System.out.println(collect);
        System.out.printf("Preços gerados em %dms para CompletableFuture", fim - inicio);
    }
}
