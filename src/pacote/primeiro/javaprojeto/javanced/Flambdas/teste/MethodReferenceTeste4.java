package pacote.primeiro.javaprojeto.javanced.Flambdas.teste;

import pacote.primeiro.javaprojeto.javanced.Flambdas.dominio.Livro;
import pacote.primeiro.javaprojeto.javanced.Flambdas.servico.LivroComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTeste4 {
    public static void main(String[] args) {
        //Para criar um objeto com lambda, é preciso que seja uma interface funcional, como supplier.
//        Supplier<LivroComparators> comparatorsSupplier = () -> new LivroComparators();
        Supplier<LivroComparators> comparatorsSupplier = LivroComparators::new;
        LivroComparators livroComparators = comparatorsSupplier.get();
        List<Livro> livros = new ArrayList<>(List.of(new Livro("A Metamorfose", 104),
                new Livro("Crime e Castigo", 562),
                new Livro("Os Miseráveis", 426),
                new Livro("1984", 265)));
        livros.sort(livroComparators::comparePaginasNaoEstatico);
        //Contudo, para criar um objeto de construtor com parâmetros, isso seria diferente.

        //Com lambda.
        BiFunction<String, Integer, Livro> livroBiFunction = (nome, paginas) -> new Livro(nome, paginas);

        //Com method Reference.
        BiFunction<String, Integer, Livro> livroBiFunction2 = Livro::new; //Modelo de objeto.
        System.out.println(livroBiFunction2.apply("Finnegans Wake", 635)); //Objeto sendo criado.
    }
}
