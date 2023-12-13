package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class StreamTeste11 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80),
            new Filme("Pulp Fiction", 160),
            new Filme("Knoshin", 65),
            new Filme("Buffalo '66", 100),
            new Filme("City Lights", 85),
            new Filme("City Lights", 85),
            new Filme("The Seventh Seal", 100),
            new Filme("Vivre sa Vie", 70)));

    public static void main(String[] args) {
        //Comparação do collectors/stream
        System.out.println(filmes.stream().count());
        System.out.println(filmes.stream().collect(Collectors.counting()));

        filmes.stream().max(Comparator.comparing(Filme::getDuracao))
                .ifPresent(System.out::println);
        filmes.stream().collect(
                Collectors.maxBy(
                        Comparator.comparing(
                                Filme::getDuracao))
                ).ifPresent(System.out::println);

        System.out.println(filmes.stream().mapToInt(Filme::getDuracao).distinct().sum());
        System.out.println(filmes.stream().distinct().collect(Collectors.summingDouble(Filme::getDuracao)));

        //Collectors - Sumarização; todas as estatísticas sobre um conjunto de objetos.
        LongSummaryStatistics collect = filmes.stream().collect(Collectors.summarizingLong(Filme::getDuracao));
        System.out.println(collect);

        //O mesmo pode ser feito com Strings, com uso de delimitadores.
        String nomes = filmes.stream().map(Filme::getTitulo).collect(Collectors.joining(" | "));
        System.out.println(nomes);
    }
}
