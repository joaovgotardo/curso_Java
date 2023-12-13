package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste5 {
    public static void main(String[] args) {
        List<String> list = List.of("Ano", "Novo", "Novo", "2024");
        String[] name = list.get(0).split("");

        //Com Streams:
        List<String> collected = list.stream().map(l -> l.split("")) //Retorna Stream<String[]>
                .flatMap(Arrays::stream) //Retorna Stream<String>, por causa da conversão.
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}
