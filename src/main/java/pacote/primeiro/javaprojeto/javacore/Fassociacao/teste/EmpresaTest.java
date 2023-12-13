package pacote.primeiro.javaprojeto.javacore.Fassociacao.teste;

import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.Empresa;
import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.Funcionario;

public class EmpresaTest {
    public static void main(String[] args) {
        //O ideal é começar com uma classe sem uma associação direta;
        Funcionario funcionario = new Funcionario("Larry Page");
        Funcionario[] funcionarios = {funcionario}; //Passando os elementos do array
        Empresa empresa = new Empresa("Google", funcionarios);
        empresa.imprime();
    }
}
