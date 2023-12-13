package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import pacote.primeiro.javaprojeto.javanced.Hstreams.dominio.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste8 {
    static List<Filme> filmes = new ArrayList<>(List.of(new Filme("Persona", 80),
            new Filme("Pulp Fiction", 160),
            new Filme("Knoshin", 65),
            new Filme("Buffalo '66", 100),
            new Filme("City Lights", 85),
            new Filme("City Lights", 85),
            new Filme("The Seventh Seal", 100),
            new Filme("Vivre sa Vie", 70)));

    public static void main(String[] args) {
        //Somar durações acima de 90, retorna a soma das durações.
        Integer reduced = filmes.stream()
                .map(Filme::getDuracao)//O map é útil para fazer a stream trocar sua classe.
                .filter(f -> f > 90)
                .reduce(0, Integer::sum);
        System.out.println(reduced);

        //Para aplicações de maior performance, existe o LongStream e o DoubleStream.
        //IntegerStream não existe justamente por isso ser focado para aplicações mais robustas.
        //Ex:
//        filmes.stream().mapToDouble(Filme::getDuracao).filter((f -> f > 90)).sum();
    }
}
