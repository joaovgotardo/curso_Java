package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PeriodTeste {
    public static void main(String[] args) {
        //Diferente de Duration, Period aceita datas.
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusYears(5).plusMonths(2).plusWeeks(1);
        Period period = Period.between(ld1, ld2);
        //Não aceita localdatetime. Também tem métodos com os de Duration.
        System.out.println(period);
        Period p2 = Period.ofWeeks(17);
        //Para pegar a quantidade de meses em 17 semanas, precisa-se do ChronoUnit.
        System.out.println(p2);
        //Calcula de agora até 17 semanas, o número de meses.
        System.out.println(ld1.until(ld1.plusDays(p2.getDays()), ChronoUnit.MONTHS));

        LocalDateTime ld4 = LocalDateTime.now().plusHours(2).plusMinutes(30);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        String duracao = ld4.format(dtf);
        System.out.println(duracao);
    }
}
