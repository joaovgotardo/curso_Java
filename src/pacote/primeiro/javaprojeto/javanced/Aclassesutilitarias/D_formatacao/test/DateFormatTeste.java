package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.D_formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dfor = new DateFormat[7]; //Pode-se usar o new, apesar de ser abstrata, por ser array
        dfor[0] = DateFormat.getInstance();
        dfor[1] = DateFormat.getDateInstance();
        dfor[2] = DateFormat.getDateTimeInstance();
        dfor[3] = DateFormat.getDateInstance(DateFormat.SHORT); //Esses são alguns estilos
        dfor[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfor[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dfor[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat a:dfor) {
            System.out.println(a.format(c.getTime())); //Se não for formatada, retorna as posições de memória.
        }
    }
}
