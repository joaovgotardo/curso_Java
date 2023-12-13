package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste6 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80),
            new Filme("Pulp Fiction", 160),
            new Filme("Knoshin", 65),
            new Filme("Buffalo '66", 100),
            new Filme("City Lights", 85),
            new Filme("City Lights", 85),
            new Filme("The Seventh Seal", 100),
            new Filme("Vivre sa Vie", 70)));
    public static void main(String[] args) {
        //O anymatch retorna um booleano a partir de um predicate, se qualquer elemento tiver aquela característica.
        System.out.println(filmes.stream().anyMatch(f -> f.getDuracao() > 120));
        //O allmatch retorna se todos os elementos tiverem.
        System.out.println(filmes.stream().allMatch(f -> f.getDuracao() != 60)); //Retorna true, pois nenhum é 60.
        //O nonmatch retorna se nenhum elemento tiver.
        System.out.println(filmes.stream().allMatch(f -> f.getDuracao() != 65)); //Retorna false, pois um é 65.
        //O findAny é quase como um random; vai retornar um elemento dentro de uma lógica determinada.
        filmes.stream().filter(f -> f.getDuracao() > 90)
                .findAny() //O FindAny retorna um Optional, devido à chance de existir NulPointer.
                .ifPresent(System.out::println);
        //O findFirst retorna o primeiro dessas lógica.
        filmes.stream().filter(f -> f.getDuracao() >= 70 )
                .sorted(Comparator.comparing(f -> f.getTitulo()))
                .findFirst()//Pode-se ainda usar o max e o min.
                .ifPresent(System.out::println);
    }
}
