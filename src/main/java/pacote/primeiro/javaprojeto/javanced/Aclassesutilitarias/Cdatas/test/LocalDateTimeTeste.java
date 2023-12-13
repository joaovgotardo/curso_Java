package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste {
    public static void main(String[] args) {
        //Uma junção de LocalDate e LocalTime, basicamente
        LocalDateTime localDateTime = LocalDateTime.now();
        //Também é possível fazer o parse dessas classes.
        LocalDate date = LocalDate.parse("2019-11-15");
        LocalTime time = LocalTime.parse("22:47:10");
        //Pode-se também relacionar as três classes em uma única variável.
        LocalDateTime ldt = date.atTime(time);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println(ldt);
    }
}
