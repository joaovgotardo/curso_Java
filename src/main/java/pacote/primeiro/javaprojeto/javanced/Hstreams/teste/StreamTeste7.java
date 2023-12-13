package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import java.util.List;

public class StreamTeste7 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);

        //Sem reduce
        int cont = 0;
        for (Integer integer:integers) {
            cont += integer;
        }
        System.out.println(cont);

        //Com reduce (Pode ser substituído por Integer::sum)
        integers.stream().reduce((x, y) -> x+y) //Retorna um optional. Se adicionarmos uma
        //identidade, retorna um inteiro.
                .ifPresent(System.out::println);

        //Multiplicação:
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);

        //Máximo:
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
        //integers.stream().reduce((x, y) -> x > y ? x : y) (Com ternário);


    }
}
