package pacote.primeiro.javaprojeto.javanced.Njunit.dominio;

import java.util.Objects;

//Um record é como um classe do lombok; tem uma sintaxe ligeiramente diferente. Não pode ser extendida.
public record Livro(String nome, String autor, int paginas) {
    //O record tem o equals, hashCode e toString. Os atributos são accessors, havendo apenas getters.
    //Não podem ser criados atributos de instância, somente estáticos. Inclui blocos de inicialização.
    //Pode-se usar generics.
    //Construtor: O Canonical é o mesmo que é criado dentro dos () do record, e não se recomenda.

    //Compact:
    public Livro {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(autor);
    }

    //Testes que podem ser feitos: se instâncias são iguais em seus equals e hashCode, se lança
    //nullPointer, se ainda é record.

    //PatternMatching instanceOf - O instanceOf, antes, precisava de um cast para verificar.

}
