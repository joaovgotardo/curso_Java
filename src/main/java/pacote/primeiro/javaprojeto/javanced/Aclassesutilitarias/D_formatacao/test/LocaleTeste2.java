package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.D_formatacao.test;

import java.util.Locale;

public class LocaleTeste2 {
    public static void main(String[] args) {
        //Pode-se ver com o default a iso lingua-local do sistema.
        String[] isoPaises = Locale.getISOCountries();
        String[] isoLinguas = Locale.getISOLanguages();
        for (String isolingua:isoLinguas) {
            System.out.println(isolingua);
        }for (String isopais:isoPaises) {
            System.out.println(isopais);
        }
    }
}
