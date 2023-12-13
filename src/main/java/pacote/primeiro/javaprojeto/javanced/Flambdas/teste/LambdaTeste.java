package pacote.primeiro.javaprojeto.javanced.Flambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste {
    public static void main(String[] args) {
        List<String> strings = List.of("Jimmy", "John", "Mary", "Anne");
        forEach(strings, st -> System.out.println(st));
        List<Double> doubles = List.of(1.6, 3.7, 5.7, 2.5, 8.6);
        forEach(doubles, db -> System.out.println(db > 5));
    }

    //Consumer - Executa uma operação e retorna void.
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T e: list){
            consumer.accept(e);
            //accept vai performar essa operação dado um argumento.
        }
    }
}
