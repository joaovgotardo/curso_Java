package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.teste;

import pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        //Primeira Forma, sem getter e setter
//        funcionario01.nome = "Jaja"; funcionario01.idade = 20;
//        funcionario01.salario = new double[]{2500.00, 2400.00, 2300.17};
//        funcionario02.nome = "Jeje"; funcionario02.idade = 35;
//        funcionario02.salario = new double[]{1750, 2150, 2950};
//        funcionario03.nome = "Jojo"; funcionario03.idade = 54;
//        funcionario03.salario = new double[]{6591, 7205.51, 7539.94};


        //Com getter e setter
        funcionario01.setNome("Jaja"); funcionario01.setIdade(20);
        funcionario01.setSalario(new double[]{2500.00, 2400.00, 2300.17});
        funcionario02.setNome("Jeje"); funcionario02.setIdade(35);
        funcionario02.setSalario(new double[]{1750, 2150, 2950});
        funcionario03.setNome("Jojo"); funcionario03.setIdade(54);
        funcionario03.setSalario(new double[]{6591, 7205.51, 7539.94});
        funcionario01.imprimir();
        funcionario02.imprimir();
        funcionario03.imprimir();

    }
}
