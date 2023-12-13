package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Bstrings.test;

public class StringsTest2 {
    public static void main(String[] args) {
        String jogo = "         Galaga ";
        System.out.println(jogo.charAt(12));
        System.out.println(jogo.length());
        System.out.println(jogo.replace("g", "xi")); //Substitui uma string por outra
        System.out.println(jogo.substring(9, 12)); //O último mostrado será o penúltimo, ou seja 2.
        System.out.println(jogo.trim()); //Remove valores em branco no início e final
    }
}
