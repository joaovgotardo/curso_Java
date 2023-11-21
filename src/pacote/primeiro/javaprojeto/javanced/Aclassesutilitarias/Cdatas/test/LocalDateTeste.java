package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        //Com a API Local (Date, Time ou DateTime), fica mais simples pegar uma data.
        LocalDate date = LocalDate.of(2024, Month.AUGUST, 23);
        LocalDate date2 = LocalDate.now();
        //De maneira semelhante à String, date2 só é mutável se for criado um novo objeto.
        date2 = date2.minusMonths(6);
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //Se for um ano bissexto
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
