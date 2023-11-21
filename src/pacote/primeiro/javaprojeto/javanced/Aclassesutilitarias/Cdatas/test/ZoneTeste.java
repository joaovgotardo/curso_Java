package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Cdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTeste {
    public static void main(String[] args) {
        //Map é uma coleção, com uma chave e um valor.
        //ZoneId é usado para zonas de horário.
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        //Pode-se pegar um valor específico de alguma zona.
        //Para mudar o horário de alguma variável, faz-se:
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt = ldt.atZone(zoneId); //Agora, será exibido o ldt mais o horário apontado.
        System.out.println(zdt);

        //Exemplo usando Instant, que retorna um horário Zulu (GMT), já aplicado.
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        System.out.println(zonedDateTime);

        //Usada para zonas que não se sabe o horário; deve-se seguir uma sintaxe estrita para evitar exceções.
        ZoneOffset zoneOffset = ZoneOffset.of("-05:00");
        OffsetDateTime offsetDateTime = ldt.atOffset(zoneOffset);
        System.out.println(offsetDateTime);
        //A diferença é que esse método retornará sem a zona, apenas o horário de diferença a GMT.

        JapaneseDate japaneseDate = JapaneseDate.from(ldt);
        System.out.println(japaneseDate);
    }
}
