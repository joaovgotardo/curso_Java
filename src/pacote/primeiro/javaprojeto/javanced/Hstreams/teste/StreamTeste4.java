package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste4 {
    //FlatMap - Como o map, para elementos aninhados.
    public static void main(String[] args) {
        List<List<String>> empresa = new ArrayList<>();
        List<String> gerentes = List.of("Pedro", "Miguel");
        List<String> supervisores = List.of("Ana Maria", "Helena", "Henrique", "Ricardo");
        List<String> vendedores = List.of("Eduardo", "Joao", "Paulo", "Beatriz", "Maria", "Sonia");
        empresa.add(gerentes);
        empresa.add(supervisores);
        empresa.add(vendedores);

        //Sem Streams:
        for (List<String> pessoas : empresa) {
            for (String pessoa : pessoas){
                System.out.println(pessoa);
            }
        }
        //Com Stream:
        empresa.stream().
                flatMap(Collection::stream).
                forEach(System.out::println);
        //Retorna uma stream que consiste nos resultados da substituição de cada elemento dela
        //pelo conteúdo de uma stream mapeada produzido pela aplicação da função de
        //mapeamento fornecida a cada elemento.
    }
}
