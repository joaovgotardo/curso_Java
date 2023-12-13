package pacote.primeiro.javaprojeto.javacore.Gheranca.dominio;

public class Funcionario extends Pessoa{

    //A herança é a extensão das funcionalidades de uma classe;
    private double salario;

    static{
        System.out.println("Dentro do bloco estático Funcionario");
    }
    {
        System.out.println("Dentro do bloco não estático Funcionario");
    }

    //Um método de mesma assinatura da classe-pai faz com que ela se sobreponha
    //Se for chamada, ela irá usar somente o que está dentro dela
    public void imprimir(){
        super.imprimir(); //Através do super, pode-se executar o método da classe-pai,
        // e em seguida adicionar outras funcionalidades;
        System.out.println(salario);
    }

    //Se um construtor é criado na classe-pai, a subclasse também deve ter uma; pode-se referenciar os
    //atributos usados na primeira através do super;
    public Funcionario(String nome, double salario){
        super(nome);
        this.salario = salario;
        System.out.println("EEEEI MAN");
    };

    public void relatorio(){
        System.out.println("Foi feito o relatório por " + this.nome + ", que recebe R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
