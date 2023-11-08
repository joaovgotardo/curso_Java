package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex6_Funcionario;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex_6AsAdmin;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex_6AsTecnico;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex_6AsTecnicoTurno;

public class Ex6_FuncionarioTeste {
    public static void main(String[] args) {
        Ex_6AsAdmin admin1 = new Ex_6AsAdmin("Adrielson", 2500, 15016);
        Ex_6AsTecnico tecnico1 = new Ex_6AsTecnico("Laurencio", 3000, 1019, Ex_6AsTecnicoTurno.DIURNO);
        Ex_6AsTecnico tecnico2 = new Ex_6AsTecnico("Notorio", 2750, 150195, Ex_6AsTecnicoTurno.NOTURNO);
        admin1.exibeDados(); System.out.println("-------");
        tecnico1.exibeDados(); System.out.println("-------");
        tecnico2.exibeDados(); System.out.println("-------");
    }
}
