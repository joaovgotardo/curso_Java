package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

//Faça um programa que:
//a) Crie uma empresa;
//b) Adicione a esta empresa alguns departamentos;
//c) Adicione aos departamentos alguns funcionários;
//d) Dê aumento de 10% a todos os funcionários de um determinado departamento;
//É esperado que seu código seja bem encapsulado. Por exemplo, para adicionar um
//departamento em uma empresa (ou um funcionário a um departamento), não se deve acessar
//o vetor (ou lista) de departamentos diretamente, mas sim ter um método na classe que
//representa a empresa para adicionar um departamento.

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex1_Departamento;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex1_Empresa;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex1_Funcionario;

public class Ex1_EmpresaTeste {
    public static void main(String[] args) {
        Ex1_Funcionario f1 = new Ex1_Funcionario("A", 1750, "11-06-2021");
        Ex1_Funcionario f2 = new Ex1_Funcionario("B", 2500, "04-04-2018");
        Ex1_Funcionario f3 = new Ex1_Funcionario("C", 1500, "21-07-2022");
        Ex1_Funcionario f4 = new Ex1_Funcionario("D", 3000, "09-11-2017");
        Ex1_Funcionario[] fs1 = {f1, f2};
        Ex1_Funcionario[] fs2 = {f3, f4};
        Ex1_Departamento d1 = new Ex1_Departamento("Dep_BMA", fs1);
        Ex1_Departamento d2 = new Ex1_Departamento("Dep_Z40L", fs2);
        Ex1_Departamento[] ds = {d1, d2};
        Ex1_Empresa empresa = new Ex1_Empresa("Andraus Materiais", 491849120, ds);
        for (Ex1_Funcionario funcionario: fs1) {
            funcionario.setSalario(funcionario.getSalario()*0.1 + funcionario.getSalario());
        }
        empresa.imprimir(); System.out.println("-------------");
        d1.imprimir(); System.out.println("-------------");
        f1.imprimir(); System.out.println("-------------");
        f2.imprimir(); System.out.println("-------------");
        d2.imprimir(); System.out.println("-------------");
        f3.imprimir(); System.out.println("-------------");
        f4.imprimir(); System.out.println("-------------");
    }
}
