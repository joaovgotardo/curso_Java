package pacote.primeiro.javaprojeto.javacore.Gheranca.teste;

import pacote.primeiro.javaprojeto.javacore.Gheranca.dominio.Funcionario;

public class HerancaTeste2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ananias", 2500.00);
        //Ordem de execução:
        //Bloco estático da superclasse > Bloco estático da subclasse > Bloco não estático da Superclasse >
        //Construtor da superclasse > Bloco não estático da subclasse > Construtor da subclasse;
    }
}
