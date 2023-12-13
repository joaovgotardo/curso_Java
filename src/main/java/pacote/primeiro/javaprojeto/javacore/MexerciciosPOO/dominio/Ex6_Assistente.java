package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex6_Assistente extends Ex6_Funcionario {
    private int matricula;
    public Ex6_Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Número de matrícula: " + matricula);
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
