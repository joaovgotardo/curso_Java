package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex6_AsTecnico extends Ex6_Assistente{
    public Ex6_AsTecnicoTurno turno;

    public Ex6_AsTecnico(String nome, double salario, int matricula, Ex6_AsTecnicoTurno turno) {
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
