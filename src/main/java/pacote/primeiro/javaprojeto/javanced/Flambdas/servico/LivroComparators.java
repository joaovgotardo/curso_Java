package pacote.primeiro.javaprojeto.javanced.Flambdas.servico;

import pacote.primeiro.javaprojeto.javanced.Flambdas.dominio.Livro;

public class LivroComparators {
    public static int comparePorNome(Livro l1, Livro l2){
        return l1.getNome().compareTo(l2.getNome());
    }

    public static int comparePaginas(Livro l1, Livro l2){
        return Integer.compare(l1.getPaginas(), l2.getPaginas());
        //Dessa forma se comparam integers.
    }

    //Método não estático.
    public int comparePaginasNaoEstatico(Livro l1, Livro l2){
        return Integer.compare(l1.getPaginas(), l2.getPaginas());
    }
}
