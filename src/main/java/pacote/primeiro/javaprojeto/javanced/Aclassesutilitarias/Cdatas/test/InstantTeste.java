package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste {
    public static void main(String[] args) {
        //A Instant é quase como a Date, mas representa o tempo em nanosegundos.
        //Muito útil em cronômetros, por exemplo.
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        //instant utiliza GMT, ou UTC, e ldt utiliza a hora do sistema.
        //Usado para sistemas internacionalizados.
        System.out.println(instant.getEpochSecond()); //Representa os segundos desde 1/1/1970.
        System.out.println(instant.getNano()); //Representa os nano de um segundo apenas.
    }
}
