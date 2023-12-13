package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.D_formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste {
    public static void main(String[] args) {
        //Classe usada para formatação de números.
        Locale localeUS = Locale.US;
        Locale localeGE = Locale.GERMANY;
        Locale localeFR = Locale.FRANCE;
        Locale localeJP = Locale.JAPAN;
        Locale localeCN = Locale.CHINA;
        NumberFormat[] nf = new NumberFormat[5];
        nf[0] = NumberFormat.getInstance(localeUS);
        nf[1] = NumberFormat.getInstance(localeGE);
        nf[2] = NumberFormat.getInstance(localeFR);
        nf[3] = NumberFormat.getInstance(localeJP);
        nf[4] = NumberFormat.getInstance(localeCN);
        double valor = 15_000.3525; //O número a ser iterado;
        for (NumberFormat nufo:nf) {
            System.out.println(nufo.format(valor));
        }
    }
}
