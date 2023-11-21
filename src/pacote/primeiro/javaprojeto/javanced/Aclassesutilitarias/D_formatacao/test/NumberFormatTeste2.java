package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.D_formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste2 {
    public static void main(String[] args) {
        //Classe usada para formatação de números.
        Locale localeUS = Locale.US;
        Locale localeGE = Locale.GERMANY;
        Locale localeFR = Locale.FRANCE;
        Locale localeJP = Locale.JAPAN;
        Locale localeCN = Locale.CHINA;
        NumberFormat[] nf = new NumberFormat[5];
        nf[0] = NumberFormat.getCurrencyInstance(localeUS);
        nf[1] = NumberFormat.getCurrencyInstance(localeGE);
        nf[2] = NumberFormat.getCurrencyInstance(localeFR);
        nf[3] = NumberFormat.getCurrencyInstance(localeJP);
        nf[4] = NumberFormat.getCurrencyInstance(localeCN);
        //Dessa vez para um valor monetário.
        double valor = 15_000.3525; //O número a ser iterado;
        for (NumberFormat nufo:nf) {
            System.out.println(nufo.getMaximumFractionDigits()); //Retorna o máximo de dígitos
            //Um set pode deixar os valores mais uniformes, se preciso.
            System.out.println(nufo.format(valor));
        }
        String emstring = "$15,000.35"; //É necessário por o valor monetário, ou ocorre um unparseable.
        //É necessário realizar uma exceção para executar o parse.
        try {
            System.out.println(nf[0].parse(emstring));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
