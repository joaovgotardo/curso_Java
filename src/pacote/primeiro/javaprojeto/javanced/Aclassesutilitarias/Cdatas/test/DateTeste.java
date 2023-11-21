package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.util.Date;

public class DateTeste {
    public static void main(String[] args) {
        Date date = new Date(-1_000_000_00000L); //date é um long, que conta em ms desde 1/1/1970
        System.out.println(date); //Também podem-se utilizar valores antes dessa data com -.
        Date date2 = new Date(1700423555936L);
        System.out.println(date2); //Retorna a hora de agora em ms a partir da data inicial.
        //A maioria dos métodos de date está depreciado.
    }
}
