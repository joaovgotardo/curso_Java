package pacote.primeiro.javaprojeto.javacore.Gheranca.dominio;

public class Funcionario extends Pessoa{
    //A herança é a extensão das funcionalidades de uma classe;
    private double salario;

    //Um método de mesma assinatura da classe-pai faz com que ela se sobreponha
    //Se for chamada, ela irá usar somente o que está dentro dela
    public void imprimir(){
        super.imprimir(); //Através do super, pode-se executar o método da classe-pai,
        // e em seguida adicionar outras funcionalidades;
        System.out.println(salario);
    }

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
