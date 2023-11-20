package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Bstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String a = "Essa é a string";
        a.concat( "e essa é a concatenação dela.");
        //Uma StringBuilder não é mais imutável, por ser uma classe.
        StringBuilder b = new StringBuilder("Essa é a stringbuilder");
        b.append(" e essa é a concatenação.");
        System.out.println(a);
        System.out.println(b);
        b.substring(0, 6); //A substring não altera o valor da stringbuilder, pois retorna string.
        String c = b.substring(0, 6); //Altera da mesma forma que uma string comum.
        System.out.println(c);
        b.reverse(); //Outros métodos não tem esse comportamento. Esse retorna uma stringbuilder.
        b.delete(16, 21);
        System.out.println(b);
    }
}
