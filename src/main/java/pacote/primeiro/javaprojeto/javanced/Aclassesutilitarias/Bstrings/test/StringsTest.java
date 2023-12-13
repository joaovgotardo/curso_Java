package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Bstrings.test;

public class StringsTest {
    public static void main(String[] args) {
        String nome = "NomeNome"; //String Pool
        //Assim que NomeNome for criado na pool, ele torna-se um objeto, e todas as variáveis
        //farão referência a ele;
        String nome2 = "NomeNome";
        nome = nome.concat(" Existe"); //Strings são imutáveis, logo somente concatenar não
        //surte efeito, deve-se modificar a variável.
        System.out.println(nome.equals(nome2));
        String nome3 = new String("NomeNome");
        //Se compararmos nome2 com nome3, ambos são diferentes, pois a String de nome2 foi criada
        //no pool, e a outra, fora da pool (heap), que referencia nome2.
        System.out.println(nome2 == nome3.intern()); //Seria verdadeiro, pois o método intern agora
        //referencia a string da pool a quem a string do heap está referenciando.
    }
}
