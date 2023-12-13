package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

//Uma classe filme (título e duração);
//Pegar os filmes por nome.
//Pegar os três primeiros que tenham menos de 1h30min.

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class StreamTeste {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80),
                new Filme("Pulp Fiction", 160),
                new Filme("Knoshin", 65),
                new Filme("Buffalo '66", 100),
                new Filme("City Lights", 85),
                new Filme("The Seventh Seal", 100),
                new Filme("Vivre sa Vie", 70)));
        //Filmes por título
        filmes.sort(Comparator.comparing(Filme::getTitulo));
        System.out.println(filmes);

        List<String> menorDuracao = new ArrayList<>();
        for (Filme filme:filmes) {
            if(filme.getDuracao() < 90){
                menorDuracao.add(filme.getTitulo());
            }if(menorDuracao.size() == 3){
                break;
            }
        }
        System.out.println(menorDuracao);


    }
}
