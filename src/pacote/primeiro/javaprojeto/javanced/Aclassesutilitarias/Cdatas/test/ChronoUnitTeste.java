package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste {
    public static void main(String[] args) {
        LocalDate fim = LocalDate.of(1918, 11, 11);
        LocalDate hoje = LocalDate.now();
        //Essa é a função da ChronoUnit.
        System.out.println(ChronoUnit.DAYS.between(fim, hoje));
        System.out.println(ChronoUnit.WEEKS.between(fim, hoje));
        System.out.println(ChronoUnit.MONTHS.between(fim, hoje));
        System.out.println(ChronoUnit.CENTURIES.between(fim, hoje));
    }
}
