package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;
import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Genero;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste12 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80, Genero.DRAMA_ANTIGO),
            new Filme("Pulp Fiction", 160, Genero.ACAO),
            new Filme("Knoshin", 65, Genero.DRAMA_MODERNO),
            new Filme("Buffalo '66", 100, Genero.DRAMA_MODERNO),
            new Filme("City Lights", 85, Genero.DRAMA_ANTIGO),
            new Filme("The Seventh Seal", 100, Genero.DRAMA_ANTIGO),
            new Filme("Vivre sa Vie", 70, Genero.DRAMA_ANTIGO)));
    public static void main(String[] args) {
        //Sem streams
        Map<Genero, List<Filme>> mapGeneros = new HashMap<>();
        List<Filme> acao = new ArrayList<>();
        List<Filme> d_antigo = new ArrayList<>();
        List<Filme> d_moderno = new ArrayList<>();
        for (Filme filme:filmes) {
            switch (filme.getGenero()){
                case ACAO: acao.add(filme); break;
                case DRAMA_ANTIGO: d_antigo.add(filme); break;
                case DRAMA_MODERNO: d_moderno.add(filme); break;
            }
        }
        mapGeneros.put(Genero.ACAO, acao);
        mapGeneros.put(Genero.DRAMA_ANTIGO, d_antigo);
        mapGeneros.put(Genero.DRAMA_MODERNO, d_moderno);
        System.out.println(mapGeneros);

        //Com Stream
        Map<Genero, List<Filme>> collect = filmes.stream().collect(Collectors.groupingBy(Filme::getGenero));
        //o grouping by facilita muito o agrupamento de listas, otimizando o código.
        System.out.println(collect);
    }
}
