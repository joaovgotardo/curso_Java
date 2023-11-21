package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste {
    public static void main(String[] args) {
        //Calendar inclui internacionalização. É uma classe abstrata e não usa new.
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo kk"); //Um uso da classe Calendar.
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //outras funcionalidades de Calendar

        //Pode-se modificar os dias da semana para uma agenda, por exemplo:
        c.add(Calendar.DAY_OF_MONTH, 7);
        c.add(Calendar.HOUR, 14);

        Date date = c.getTime();
        System.out.println(date); //Para exibir uma data de uma maneira formatada.
    }
}
