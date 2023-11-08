package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex_6AsTecnico extends Ex6_Assistente{
    public Ex_6AsTecnicoTurno turno;

    public Ex_6AsTecnico(String nome, double salario, int matricula, Ex_6AsTecnicoTurno turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    @Override
    public void addAumento(double valor){
        if (turno.TURNO == 2){
            valor = salario*0.15;
            super.addAumento(valor);
        }
    }
}
