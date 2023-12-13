package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.teste;

import pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio.ErroLoginException;
import pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio.Funcionario;
import pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.verificar(); //Não ocorrem erros em subclasses.

        try{ //Contudo, as classes que implementaram as exceções devem lidar com elas.
            pessoa.verificar();
        }catch (ErroLoginException | FileNotFoundException e){
            e.printStackTrace();
        }
        //Se forem adicionadas outros throws, a própria classe que o fez deve tratar isso.
    }
}
