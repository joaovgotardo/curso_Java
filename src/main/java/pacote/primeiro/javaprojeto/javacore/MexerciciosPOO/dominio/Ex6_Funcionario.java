//6 - Implemente a classe Funcionario com nome, salario e os métodos
//addAumento(double valor), ganhoAnual() e exibeDados() - imprime os valores do funcionário.
//a. crie a classe Assistente, que também é um funcionário, e que possui um número de
//matrícula (faça os métodos GET e SET). Sobrescreva o método exibeDados().
//b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes
//Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes
//Tecnico e Administrativo e sobrescreva o método ganhoAnual() de ambas as classes
//(Administrativo e Tecnico).1
package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex6_Funcionario {
    protected String nome;
    protected double salario;

    public Ex6_Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor){
        valor = 0;
        this.salario = salario + valor;
    }

    public double ganhoAnual(){
        return this.salario = salario*12;
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Ganho Anual: " + ganhoAnual());
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
}
