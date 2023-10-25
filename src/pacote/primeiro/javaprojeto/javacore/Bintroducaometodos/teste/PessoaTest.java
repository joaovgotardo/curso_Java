package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.teste;

import pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Adriano"); //
        pessoa.setIdade(35);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
