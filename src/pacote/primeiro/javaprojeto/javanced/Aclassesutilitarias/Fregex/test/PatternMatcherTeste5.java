package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Fregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste5 {
    public static void main(String[] args) {
        //Encontrando um e-mail.  E-mail válido para o server:
        // começa por uma letra minúscula. Não pode ter caracteres especiais.
        // Deve ser seguido por um @. Tem que seguir com um desses e-mails:
        // hotmail ou gmail. E após deve ter apenas .com.
//        String regex = "0[xX]([0-9A-Fa-f])+(\\s|$)";+
        String regex = "[a-z][(A-Za-z0-9\\._)]@(hotmail|gmail)\\.com";
        String texto = "pRIMEIRO@gmail.com, segundo@hotmail.com, $!$!terceiromail.br," +
                "410quarto@email.com.br, quI.nTo80@gmail.com, sexto010=@gmail.com, " +
                "sEtimo1490@gmail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        //Através do método matches, pode-se verificar se algum método é válido. Retorna um boolean
        System.out.println("sexto010=@gmail.com".matches(regex));
        //Também pode-se transformar a variável texto em um array, usando o regex, através do Arrays.
        System.out.println(Arrays.toString(texto.split(",")));
        while(matcher.find()){
            System.out.println(matcher.group() + "\n");
            //matcher.start() + " " +
        }
        //Outros metacaracteres (anchors):
        //^ pega os caracteres do início da linha. Também funciona como negação:
        //[^abc] Pega todo caracter que não for um desses.
        //regexr.com
    }
}
