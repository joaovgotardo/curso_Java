package pacote.primeiro.javaprojeto.javanced.Flambdas.teste;

import pacote.primeiro.javaprojeto.javanced.Flambdas.dominio.Livro;
import pacote.primeiro.javaprojeto.javanced.Flambdas.servico.LivroComparators;

import java.util.ArrayList;
import java.util.List;

//Método não estático.
public class MethodReferenceTeste2 {
    public static void main(String[] args) {
        LivroComparators livroComparators = new LivroComparators();
        List<Livro> livros = new ArrayList<>(List.of(new Livro("A Metamorfose", 104),
                new Livro("Crime e Castigo", 562),
                new Livro("Os Miseráveis", 426),
                new Livro("1984", 265)));
        livros.sort(livroComparators::comparePaginasNaoEstatico);
        //A diferença é que é chamado através de um objeto ao invés do nome do classe.
    }
}
