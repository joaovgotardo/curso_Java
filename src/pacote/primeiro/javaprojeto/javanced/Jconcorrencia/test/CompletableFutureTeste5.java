package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio.Orcamento;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico.ServicoLojaDesconto;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTeste5 {
    public static void main(String[] args) {
        ServicoLojaDesconto sld = new ServicoLojaDesconto();
        PrecoAssinc(sld);
    }
    private static void PrecoAssinc(ServicoLojaDesconto sld) {
        long start = System.currentTimeMillis();
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        //Var - um future que pode ser explicitamente completado, e pode ser usado como CompletingStage.
        var cfs = lojas.stream()
                .map(s -> CompletableFuture.supplyAsync(() ->
                        sld.precoSincrono(s)))
                .map(cf -> cf.thenApply(Orcamento::orcamento))
                .map(cf -> cf.thenCompose(orcamento -> CompletableFuture.
                        supplyAsync(() -> sld.aplicarDesconto(orcamento))))
                //Accept realiza uma ação.
                .map(cf -> cf.thenAccept(s -> System.out.printf("%s terminou em %d%n",
                        s, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);//Isso é feito pois allOf aceita apenas arrays.

        //O .allof passa todos os completable futures, e quando eles terminarem, retorna um novo completable future.
//        CompletableFuture.allOf().

        CompletableFuture<Void> voidcfs = CompletableFuture.allOf(cfs);
        voidcfs.join();
        //Mostra quanto tempo cada loja demorou
        System.out.printf("Terminado: %b", voidcfs.isDone());

        //Há também o anyOf, que será completado quando um dos CompletableFutures ser finalizado.
        //O allOf, só se todos forem.
    }
}
