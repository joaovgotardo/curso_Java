package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex_6AsAdmin extends Ex6_Assistente{
    public Ex_6AsAdmin(String nome, double salario, int matricula) {
        super(nome, salario, matricula);
    }
    @Override
    public void addAumento(double valor){
        valor = salario*0.1;
        super.addAumento(valor);
    }
}
