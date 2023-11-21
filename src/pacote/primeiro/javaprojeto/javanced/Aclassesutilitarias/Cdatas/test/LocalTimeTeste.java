package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(19, 47, 36);
        LocalTime ltt = LocalTime.now();
        System.out.println(lt);
        //Outros métodos do LocalTime incluem
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
        //Pode-se pegar o nanosegundo do dia se for usado o timeNow
        System.out.println(ltt.get(ChronoField.MILLI_OF_DAY));
        //Vai imprimir o exato milisegundo desse dia;
    }
}
