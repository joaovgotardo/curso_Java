/*
* 1 - Crie uma classe que representa um funcionário, registrando seu nome, salário e data
de admissão. Em seguida, crie uma classe que represente um departamento de uma empresa,
registrando o nome e os funcionários que nele trabalham (para isso use um vetor, considere
um máximo de 100 funcionários). Por fim, crie uma classe que representa uma empresa,
registrando seu nome, CNPJ e departamentos (considere um máximo de 10 departamentos).
Faça um programa que:
a) Crie uma empresa;
b) Adicione a esta empresa alguns departamentos;
c) Adicione aos departamentos alguns funcionários;
d) Dê aumento de 10% a todos os funcionários de um determinado departamento;
É esperado que seu código seja bem encapsulado. Por exemplo, para adicionar um
departamento em uma empresa (ou um funcionário a um departamento), não se deve acessar
o vetor (ou lista) de departamentos diretamente, mas sim ter um método na classe que
representa a empresa para adicionar um departamento.
*/
package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex1_Funcionario {
    private String nome;
    private double salario;
    private String data_Admissao;

    public Ex1_Funcionario(String nome, double salario, String data_Admissao){
        this.nome = nome;
        this.salario = salario;
        this.data_Admissao = data_Admissao;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Data de Admissão: " + data_Admissao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getData_Admissao() {
        return data_Admissao;
    }

    public void setData_Admissao(String data_Admissao) {
        this.data_Admissao = data_Admissao;
    }
}
