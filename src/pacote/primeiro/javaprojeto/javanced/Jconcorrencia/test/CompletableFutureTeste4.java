package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio.Orcamento;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.ServicoLojaDepreciado;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.ServicoLojaDesconto;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTeste4 {
    public static void main(String[] args) {
        ServicoLojaDesconto sld = new ServicoLojaDesconto();
        PrecoSinc(sld);
        PrecoAssinc(sld);
    }

    private static void PrecoSinc(ServicoLojaDesconto sld) {
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");
        //Pega os preços de cada loja.
//        lojas.forEach(s -> System.out.println(sld.precoSincrono(s)));
        lojas.stream()
                .map(sld::precoSincrono)
                .map(Orcamento::orcamento)
                .map(sld::aplicarDesconto)
                .forEach(System.out::println);

        //Forma síncrona.
    }

    private static void PrecoAssinc(ServicoLojaDesconto sld) {
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        List<CompletableFuture<String>> comfuts = lojas.stream()
                //Pega o preço de maneira assíncrona.
                .map(s -> CompletableFuture.supplyAsync(() ->
                        sld.precoSincrono(s)))
                //Instancia um novo objeto a partir da stream anterior.
                .map(cf -> cf.thenApply(Orcamento::orcamento))
                //Retorna um novo estado de completado com o valor da função.
                .map(cf -> cf.thenCompose(orcamento -> CompletableFuture.
                        supplyAsync(() -> sld.aplicarDesconto(orcamento))))
                .collect(Collectors.toList());//Cria uma lista de Completable Futures.

        comfuts.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);
        //Forma assíncrona.
        //Esses códigos serão revistos e consertados no futuro.
    }
}
