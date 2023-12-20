package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTeste {
    public static void main(String[] args) {
        //Usada para intervalos entre datas, em segundos, ou nanosegundos.
        LocalDateTime agora = LocalDateTime.now();
        LocalDate dia = LocalDate.of(2024, 5, 14);
        LocalTime hora = LocalTime.of(13, 40);
        LocalDateTime aniversario = LocalDateTime.of(dia, hora);
        System.out.println(Duration.between(agora, aniversario)); //Tempo entre dois momentos.
        //PT4212H56M39.9677356S (P = Período, T = Tempo)
        LocalTime t1 = LocalTime.now().minusHours(11).minusMinutes(20);
        LocalTime t2 = LocalTime.now().plusHours(15).plusMinutes(47);
        System.out.println(Duration.between(t1, t2));
        //Duration não aceita LocalDate.
    }
}
