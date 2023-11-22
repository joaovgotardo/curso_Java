package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste4 {
    public static void main(String[] args) {
        //Através dos quantificadores, pode-se resolver o problema do Java pegar
        //apenas um valor.
        //? - Zero ou uma ocorrencia.
        //* - Zero ou mais.
        //+ - Uma ou mais.
        //{x, y} - De x a y.
        //() - Agrupamento.
        //| - Ou. Ex: [a(ss|m)a]
        //$ - Final da linha.
        //. - Expressão coringa, por exemplo: A.6, qualquer valor que esteja entre esses dois.
        String regexhex = "0[xX]([0-9A-Fa-f])+(\\s|$)"; //Uma ou mais.
        //\\s | $ Significa que o texto tem que vir com um espaço em branco após ou ser fim.
        String textohex = "qeo 0x14 0xFAOF 0x 0X 0xfa4014 0XFEE10 0x149H 0X9101";
        Pattern pattern = Pattern.compile(regexhex);
        Matcher matcher = pattern.matcher(textohex);
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }
        //Um número hexadecimal é reconhecido no Java ao colocar 0x antes dele.
        int hex = 0X5B8D80;
        System.out.println(hex);
    }
}
