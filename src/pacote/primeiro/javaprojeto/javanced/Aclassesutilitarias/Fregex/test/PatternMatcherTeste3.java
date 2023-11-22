package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste3 {
    public static void main(String[] args) {
        //às vezes os textos não são simples. Para isso servem os metacaracteres.
        // \d - Usado para dígitos.
        // \D - Tudo o que não for dígito.
        // \s - Espaços em branco. São considerados também \t, \n, \f, e \r
        // \S - Todos os caracteres excluindo os brancos.
        // \w - O que for a-z, A-Z, 0-9 e _
        // \W - O que não for acima.
        // [] - Range. Usado para uma "array" de caracteres.
        String regex = "[ag]"; //Seleciona a e g.
        String regex2 = "[a-k0-1]"; //Com o traço, seleciona-se um intervalo.
        String texto = "sf $uq28f2qfj82fao0# ad15@ gafdq041 @$ ¨*aqepg";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto);
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
            //.group serve para mostrar o que foi encontrado pelo matcher.
        }

        String regexhex = "0[xX][0-9A-Fa-f]";
        String textohex = "qeo 0x14 0xFAOF 0x 0X 0xfa4014 0XFEE10 qwpq 0X9101";
        Pattern pattern1 = Pattern.compile(regexhex);
        Matcher matcher1 = pattern1.matcher(textohex);
        while(matcher1.find()){
            System.out.println(matcher1.start() + " " + matcher1.group() + "\n");
        }
        //Um número hexadecimal é reconhecido no Java ao colocar 0x antes dele.
        int hex = 0X5B8D80;
        System.out.println(hex);
    }
}
