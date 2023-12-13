package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste2 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80),
            new Filme("Pulp Fiction", 160),
            new Filme("Knoshin", 65),
            new Filme("Buffalo '66", 100),
            new Filme("City Lights", 85),
            new Filme("The Seventh Seal", 100),
            new Filme("Vivre sa Vie", 70)));

    public static void main(String[] args) {
        //Coleções: Elementos no espaço.
        //Streams: Elementos no tempo.
        Stream<Filme> filmeStream = filmes.stream();
        List<String> byDuration = filmeStream.sorted(Comparator.comparing(Filme::getTitulo))
                .filter(f -> f.getDuracao() <= 90)
                .limit(3)
                .map(Filme::getTitulo)
                .collect(Collectors.toList());
        System.out.println(byDuration);

        //Ações intermediárias - Retornam o próprio stream.
        //Sorted - Retorna uma stream que consiste de elementos sortidos de acordo com o comparador.
        //Filter - Retorna uma stream a partir de um predicate.
        //Limit - Retorna uma stream limitando os elementos da stream.
        //Map - Retorna uma stream da aplicação da função dada à essa stream.

        //Ações finais - Retornam uma coleção.
        //Collect - Retorna uma coleção a partir das streams.
    }
}
