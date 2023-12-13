package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.D_formatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class DateTimeFormatterTeste {
    public static void main(String[] args) {
        //Parse - De uma string para um objeto.
        //Format - De um objeto para uma string.
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n");
        //Para fazer o parse desse objeto, deve-se passar, além do objeto desejado, o tipo
        //de ISO a ser formatada.
        LocalDate parse = LocalDate.parse("20231121", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse);

        //Pode-se também fazer o parse em diferentes modelos de data.
        DateTimeFormatter formatterpadrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String datapadrao = LocalDate.now().format(formatterpadrao);
        System.out.println(datapadrao);
        LocalDate parsepadrao = LocalDate.parse("21/11/2023", formatterpadrao);
        System.out.println(parsepadrao);

        //Também pode-se usar o Locale para personalizar a data.
        DateTimeFormatter formatterIT = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ITALIAN);
        String dataIT = LocalDate.now().format(formatterIT);
        System.out.println(dataIT); //Imprime a data em chinês
    }
}
