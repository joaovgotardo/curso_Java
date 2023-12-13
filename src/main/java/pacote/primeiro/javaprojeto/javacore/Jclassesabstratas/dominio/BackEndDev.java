package pacote.primeiro.javaprojeto.javacore.Jclassesabstratas.dominio;

public class BackEndDev extends Funcionario{
    public BackEndDev(String nome, double salario){
        super(nome, salario);
    }
    @Override
    public String toString() {
        return "BackEndDev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    @Override
    public void CBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }
}
