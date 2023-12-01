package pacote.primeiro.javaprojeto.javanced.Flambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Método não estático, chamado através do nome da classe.
public class MethodReferenceTeste3 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Michelangelo",
                "Donatello", "Leonardo", "Rafael"));
        nomes.sort(String::compareTo); //CompareTo é não estático.
        System.out.println(nomes);

        //Pode-se criar uma função e utilizar do parse também:
        Function<String, Integer> function = Integer::parseInt;
        // O integer deve vir depois
        System.out.println(function.apply("25"));

        //BiPredicate utiliza dois argumentos ao invés de um. No exemplo, o primeiro é o argumento
        //e o segundo vai verificar algo.
        BiPredicate<List<String>, String> biPredicate = List::contains;
        System.out.println(biPredicate.test(nomes, "Michelangelo"));
    }
}
