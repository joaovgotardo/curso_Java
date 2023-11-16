package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex6_AsAdmin;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex6_AsTecnico;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex6_AsTecnicoTurno;

public class Ex6_FuncionarioTeste {
    public static void main(String[] args) {
        Ex6_AsAdmin admin1 = new Ex6_AsAdmin("Adrielson", 2500, 15016);
        Ex6_AsTecnico tecnico1 = new Ex6_AsTecnico("Laurencio", 3000, 1019, Ex6_AsTecnicoTurno.DIURNO);
        Ex6_AsTecnico tecnico2 = new Ex6_AsTecnico("Notorio", 2750, 150195, Ex6_AsTecnicoTurno.NOTURNO);
        admin1.exibeDados(); System.out.println("-------");
        tecnico1.exibeDados(); System.out.println("-------");
        tecnico2.exibeDados(); System.out.println("-------");
    }
}
