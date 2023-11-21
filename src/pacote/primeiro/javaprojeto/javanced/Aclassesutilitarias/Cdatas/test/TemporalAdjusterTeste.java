package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ExibirDiaUtil implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int mais_Dias = 1;
        if (dayOfWeek == DayOfWeek.THURSDAY){
            mais_Dias += 3;
        }else if(dayOfWeek == DayOfWeek.FRIDAY){
            mais_Dias += 2;
        }else if (dayOfWeek == DayOfWeek.SATURDAY){
            mais_Dias += 1;
        }
        return temporal.plus(mais_Dias, ChronoUnit.DAYS);
    }
}
public class TemporalAdjusterTeste {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now().with(new ExibirDiaUtil());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
    }
}
