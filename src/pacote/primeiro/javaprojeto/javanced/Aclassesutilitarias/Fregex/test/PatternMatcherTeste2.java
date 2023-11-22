package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste2 {
    public static void main(String[] args) {
        //às vezes os textos não são simples. Para isso servem os metacaracteres.
        // \d - Usado para dígitos.
        // \D - Tudo o que não for dígito.
        // \s - Espaços em branco. São considerados também \t, \n, \f, e \r
        // \S - Todos os caracteres excluindo os brancos.
        // \w - O que for a-z, A-Z, 0-9 e _
        // \W - O que não for acima.
        String regex = "\\W"; //Pode-se fazer combinação de metacaracteres.
        String texto = "sf $uq28f2qfj82fao0# ad15@";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
            //.group serve para mostrar o que foi encontrado pelo matcher.
        }
    }
}
