package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste3 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80),
            new Filme("Pulp Fiction", 160),
            new Filme("Knoshin", 65),
            new Filme("Buffalo '66", 100),
            new Filme("City Lights", 85),
            new Filme("City Lights", 85),
            new Filme("The Seventh Seal", 100),
            new Filme("Vivre sa Vie", 70)));

    public static void main(String[] args) {
        filmes.forEach(System.out::println);
        //A própria List tem um método forEach. Não é necessário Stream.

        Stream<Filme> stream = filmes.stream();
        long count = stream.filter(f -> f.getDuracao() < 90)
                .distinct().count();
        System.out.println(count);
        //O distinct serve para pegar elementos apenas uma vez.
        //É importante que o equals esteja implementado para que esse método funcione.

        //Uma stream não pode ser reusada, a partir do momento de uma ação final.
        //Para reutilizar, deve-se chamar novamente a fonte de dados (filmes.stream).
    }
}
