package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        ld = ld.with(ChronoField.DAY_OF_MONTH, 29);
        //Uso do método with.
        System.out.println(ld);

        //TemporalAdjusters: Usado para ações de passagem de tempo.
        LocalDate ld2 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(ld2);

        LocalDate ld3 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println(ld3);

        LocalDate ld4 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(ld4);
    }
}
