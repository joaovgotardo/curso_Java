package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;
import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Genero;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTeste14 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80, Genero.DRAMA_ANTIGO),
            new Filme("Pulp Fiction", 160, Genero.ACAO),
            new Filme("Knoshin", 65, Genero.DRAMA_MODERNO),
            new Filme("Buffalo '66", 100, Genero.DRAMA_MODERNO),
            new Filme("City Lights", 85, Genero.DRAMA_ANTIGO),
            new Filme("The Seventh Seal", 100, Genero.DRAMA_ANTIGO),
            new Filme("Vivre sa Vie", 70, Genero.DRAMA_ANTIGO)));

    public static void main(String[] args) {
        //Agrupando pela categoria, e contando quantas existem.
        Map<Genero, Long> collectCQ = filmes.stream().collect(Collectors.groupingBy(
                Filme::getGenero, Collectors.counting()
        ));
        System.out.println(collectCQ);

        //Agrupando pela categoria, e depois pela maior duração.
        Map<Genero, Optional<Filme>> collectCD = filmes.stream().
                collect(Collectors.groupingBy(
                    Filme::getGenero, Collectors.maxBy(
                        Comparator.comparing(Filme::getDuracao))
        ));
        System.out.println(collectCD);

        //Porém, isso retorna um Optional de Filmes. Para removê-lo:
        Map<Genero, Filme> collectCD2 = filmes.stream().collect(Collectors.groupingBy(
                Filme::getGenero, Collectors.collectingAndThen(
                        Collectors.maxBy(
                                Comparator.comparing(Filme::getDuracao)
                        ), Optional::get
                )
        ));
        System.out.println(collectCD2);
        //Isso pode ser simplificado usando o BinaryOperator, e o toMap:
//        filmes.stream().collect(Collectors.toMap(
//                Filme::getGenero, Function.identity(), 
//                BinaryOperator.maxBy(
//                        Comparator.comparing(Filme::getDuracao))));
    }
}
