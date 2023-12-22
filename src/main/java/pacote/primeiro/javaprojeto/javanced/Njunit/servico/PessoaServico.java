package pacote.primeiro.javaprojeto.javanced.Njunit.servico;

import pacote.primeiro.javaprojeto.javanced.Njunit.dominio.Pessoa;

import java.util.Objects;

public class PessoaServico {
    public boolean isAdulto(Pessoa pessoa){
        Objects.requireNonNull(pessoa, "Pessoa nula.");
        return pessoa.getIdade() >= 18;
    }
    //jUnit - Se um código for mudado, por exemplo, a condição dele, ou mesmo seus argumentos,
    //o que garante que outros projetos que o usem não serão afetados?
    //O jUnit é usado para testes em geral, e é adicionado através do Maven.
}
