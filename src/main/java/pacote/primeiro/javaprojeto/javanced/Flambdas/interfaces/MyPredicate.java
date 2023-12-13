package pacote.primeiro.javaprojeto.javanced.Flambdas.interfaces;

@FunctionalInterface
public interface MyPredicate {
    //anonimas, funções, 
    boolean predicado(String nome);
    //A lambda funcionará somente se estiver agindo em uma interface funcional. Isso significa que ela
    //pode ter somente uma classe abstrata. Sintaxe da lambda:
    //(parametro) -> expressao (retorna um boolean)
    //(String nome -> nome.getNome().equals("João"));
}
