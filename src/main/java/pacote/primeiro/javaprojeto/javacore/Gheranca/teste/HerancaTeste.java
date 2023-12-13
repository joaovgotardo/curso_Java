package pacote.primeiro.javaprojeto.javacore.Gheranca.teste;

import pacote.primeiro.javaprojeto.javacore.Gheranca.dominio.Endereco;
import pacote.primeiro.javaprojeto.javacore.Gheranca.dominio.Funcionario;
import pacote.primeiro.javaprojeto.javacore.Gheranca.dominio.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setBairro("Gamboa"); endereco.setCidade("Rio de Janeiro");

        Funcionario funcionario = new Funcionario("Alemao", 3570.00);
//        funcionario.setNome("OH NO"); funcionario.setCpf("23545091"); funcionario.setData_nasc("12-03-1968");
//        funcionario.setEndereco(endereco);

        Pessoa pessoa = new Pessoa("Ronaldo");
//        pessoa.setNome("Ronaldo");
        pessoa.setCpf("123456789"); pessoa.setData_nasc("25-05-1992"); pessoa.setEndereco(endereco);
        pessoa.imprimir();
        funcionario.imprimir(); 
    }
}
