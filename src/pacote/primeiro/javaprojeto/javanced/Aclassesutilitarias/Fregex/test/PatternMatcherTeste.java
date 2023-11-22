package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste {
    public static void main(String[] args) {
        //Expressões regulares utilizam símbolos para encontrar padrões em um texto,
        //através de metacaracteres.
//        String regex = "ab";
        String regex2 = "dad";
//        String texto = "aaababaaababaaabcaab";
        String texto2 = "dadadada";
        //Pattern é usado para encontrar um padrão.
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);
        //E o matcher utiliza o pattern no texto selecionado.
        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }
        //O Java vai imprimir nas posições da String ele encontrar aquele padrão.
        //Por exemplo, a na posição 3, b em 4, ele imprime 3.
        //Contudo, em situações como as do regex2, ocorre um problema.
        //Se o padrão vai de uma posição até outra, o resto dela é ignorado, mesmo se
        //ela também tiver o padrão apresentado.
    }
}
