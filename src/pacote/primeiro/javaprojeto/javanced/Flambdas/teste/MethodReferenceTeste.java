package pacote.primeiro.javaprojeto.javanced.Flambdas.teste;

import pacote.primeiro.javaprojeto.javanced.Flambdas.dominio.Livro;
import pacote.primeiro.javaprojeto.javanced.Flambdas.servico.LivroComparators;

import java.util.ArrayList;
import java.util.List;

//Método estático.
public class MethodReferenceTeste {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(List.of(new Livro("A Metamorfose", 104),
                new Livro("Crime e Castigo", 562),
                new Livro("Os Miseráveis", 426),
                new Livro("1984", 265)));

        //Comparable com lambda:
//        Collections.sort(livros, ((o1, o2) -> o1.getNome().compareTo(o2.getNome())));
        //O method Reference pode ser aplicado da seguinte forma:
//        Collections.sort(livros, LivroComparators::comparePorNome);
//        Collections.sort(livros, LivroComparators::comparePaginas);

        //Pode ser também substituído por livros ao invés de Collections.
        livros.sort(LivroComparators::comparePorNome);
        livros.sort(LivroComparators::comparePaginas);
        System.out.println(livros);
    }
}
