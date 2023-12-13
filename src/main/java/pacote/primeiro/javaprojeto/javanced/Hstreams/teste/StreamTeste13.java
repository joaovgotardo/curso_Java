package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;
import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Genero;
import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Trailer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Trailer.*;

public class StreamTeste13 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80, Genero.DRAMA_ANTIGO),
            new Filme("Pulp Fiction", 160, Genero.ACAO),
            new Filme("Knoshin", 65, Genero.DRAMA_MODERNO),
            new Filme("Buffalo '66", 100, Genero.DRAMA_MODERNO),
            new Filme("City Lights", 85, Genero.DRAMA_ANTIGO),
            new Filme("The Seventh Seal", 100, Genero.DRAMA_ANTIGO),
            new Filme("Vivre sa Vie", 70, Genero.DRAMA_ANTIGO)));
    public static void main(String[] args) {
        //Duração maior que 90 -> Com trailer
        //Duração menor que 90 -> Sem trailer

        Map<Trailer, List<Filme>> collect = filmes.stream().collect(
                Collectors.groupingBy(
                    f -> f.getDuracao() > 90 ? COM_TRAILER : SEM_TRAILER
        ));
        System.out.println(collect);

        //Com trailer e sem, gênero:
        Map<Genero, Map<Trailer, List<Filme>>> newCollect = filmes.stream()
                .collect(Collectors.groupingBy(Filme::getGenero,
                Collectors.groupingBy(
                        f -> f.getDuracao() > 90 ? COM_TRAILER : SEM_TRAILER)));
        System.out.println(newCollect);
        //Foi adicionado o comportamento estático para simplificar.
        //Pode-se ainda extrair o método usando ctrl alt m.
    }
    //Foi feito um map dentro do outro (nested).
}
