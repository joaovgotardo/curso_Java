package pacote.primeiro.javaprojeto.javacore.Jclassesabstratas.dominio;

public class CEO extends Funcionario{

    public CEO (String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "CEO{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    @Override
    public void CBonus() {
        this.salario = salario + salario*0.08;
    }
}
