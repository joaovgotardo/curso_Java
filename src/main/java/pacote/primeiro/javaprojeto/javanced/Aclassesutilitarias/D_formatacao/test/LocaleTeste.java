package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.D_formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
    public static void main(String[] args) {
        //Podem-se usar diversas línguas e seus países, através dos ISOs.
        Locale localeUSA = new Locale("en", "US");
        Locale localeGER = new Locale("de", "GE");
        Locale localeFR = new Locale("fr", "FR");
        Locale localeCN = new Locale("zh", "CN");
        Calendar c = Calendar.getInstance();
        DateFormat dfus = DateFormat.getDateInstance(DateFormat.FULL, localeUSA);
        DateFormat dfge = DateFormat.getDateInstance(DateFormat.FULL, localeGER);
        DateFormat dffr = DateFormat.getDateInstance(DateFormat.FULL, localeFR);
        DateFormat dfcn = DateFormat.getDateInstance(DateFormat.FULL, localeCN);
        System.out.println(dfus.format(c.getTime())); //É necessário lembrar do format
        System.out.println(dfge.format(c.getTime()));
        System.out.println(dffr.format(c.getTime()));
        System.out.println(dfcn.format(c.getTime()));

        System.out.println(localeCN.getDisplayCountry(localeCN));
        System.out.println(localeCN.getDisplayLanguage(localeCN)); //Funcionalidades para mostrar língua e país
        //Se passarmos os locais da língua, será exibido como se o sistema fosse desse país.
    }
}
