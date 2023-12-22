package pacote.primeiro.javaprojeto.javanced.Njunit.teste;

import pacote.primeiro.javaprojeto.javanced.Njunit.dominio.Pessoa;
import pacote.primeiro.javaprojeto.javanced.Njunit.servico.PessoaServico;

public class AdultoTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(16);
        PessoaServico pessoaServico = new PessoaServico();
        pessoaServico.isAdulto(pessoa);
    }
}
