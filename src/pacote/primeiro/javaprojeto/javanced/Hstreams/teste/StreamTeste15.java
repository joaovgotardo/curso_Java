package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;
import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Genero;
import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Trailer;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste15 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80, Genero.DRAMA_ANTIGO),
            new Filme("Pulp Fiction", 160, Genero.ACAO),
            new Filme("Knoshin", 65, Genero.DRAMA_MODERNO),
            new Filme("Buffalo '66", 100, Genero.DRAMA_MODERNO),
            new Filme("City Lights", 85, Genero.DRAMA_ANTIGO),
            new Filme("The Seventh Seal", 100, Genero.DRAMA_ANTIGO),
            new Filme("Vivre sa Vie", 70, Genero.DRAMA_ANTIGO)));

    public static void main(String[] args) {
        //Agrupando pelo genero, e depois exibir as estatísticas de duração.
        Map<Genero, IntSummaryStatistics> generoIntSummaryStatisticsMap = filmes.stream().collect(
                Collectors.groupingBy(Filme::getGenero,
                        Collectors.summarizingInt(
                                Filme::getDuracao)));
        System.out.println(generoIntSummaryStatisticsMap);

        //Agrupando pelo genero, depois agrupando pelo trailer
        //É necessário usar o mapping, se quisermos retornar um map com as categorias
        //e depois uma lista.
        Map<Genero, List<Trailer>> genero_trailer = filmes.stream().collect(Collectors.groupingBy(
                        Filme::getGenero, Collectors.mapping(
                                f -> f.getDuracao() > 90 ? Trailer.COM_TRAILER : Trailer.SEM_TRAILER,
                                Collectors.toList())
                )
        );
        System.out.println(genero_trailer);
        //Pode-se mudar para o uso com set, usando o .toSet; se quisermos usar o LinkedHashSet,
        //usa-s toCollection(LinkedHashSet::new)
    }
}
